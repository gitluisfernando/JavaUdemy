package Secao16.ChessGame.chess;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Secao16.ChessGame.boardgame.Board;
import Secao16.ChessGame.boardgame.Piece;
import Secao16.ChessGame.boardgame.Position;
import Secao16.ChessGame.chess.pieces.King;
import Secao16.ChessGame.chess.pieces.Rook;

public class ChessMatch {

    private int turn;
    private Color currentPlayer;
    private Board board;
    private boolean check;
    private boolean checkMate;

    private List<Piece> piecesOnTheBoard = new ArrayList<>();
    private List<Piece> capturedPieces = new ArrayList<>();

    public ChessMatch() {
        board = new Board(8, 8);
        turn = 1;
        currentPlayer = Color.WHITE;
        initialSetup();
    }

    public int getTurn() {
        return turn;
    }

    public Color getCurrentPlayer() {
        return currentPlayer;
    }

    public boolean getCheck() {
        return check;
    }

    public boolean getCheckMate() {
        return checkMate;
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }

    public boolean[][] possibleMoves(ChessPosition sourcePosition) {
        Position position = sourcePosition.toPosition();
        validateSourcePosition(position);
        return board.piece(position).possibleMoves();
    }

    //Takes the piece out of its original position and places it in the destination position
    public ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition) {
        Position source = sourcePosition.toPosition();
        Position target = targetPosition.toPosition();
        validateSourcePosition(source);
        validateTargetPosition(source, target);
        Piece capturedPiece = makeMove(source, target);

        if (testCheck(currentPlayer)) {
            undoMove(source, target, capturedPiece);
            throw new ChessException("You can't put yourself in check");
        }

        check = (testCheck(opponent(currentPlayer))) ? true : false;

        //If the opponent of the piece that moved was in checkmate, the game ends
        if (testCheckMate(opponent(currentPlayer))) {
            checkMate = true;
        } else {
            nextTurn();
        }

        return (ChessPiece) capturedPiece;
    }

    /*
    Removes the piece from the source position
    Removes the possible captured piece from the target position
    Places the piece from the source position at the target position
     */
    private Piece makeMove(Position source, Position target) {
        Piece p = board.removePiece(source);
        Piece capturedPiece = board.removePiece(target);
        board.placePiece(p, target);
        if (capturedPiece != null) {
            piecesOnTheBoard.remove(capturedPiece);
            capturedPieces.add(capturedPiece);
        }
        return capturedPiece;
    }

    /*
     * If the player tries to move and put himself in check, the action must be undone
     * Return to the original square and undo if you have captured any pieces
     */
    private void undoMove(Position source, Position target, Piece capturedPiece) {
        Piece p = board.removePiece(target); //Removes the piece from the target...
        board.placePiece(p, source); //...and returns to the source

        if (capturedPiece != null) { //If there was a captured piece
            board.placePiece(capturedPiece, target); //Place the piece back on the board
            capturedPieces.remove(capturedPiece); //Remove from captured pieces list...
            piecesOnTheBoard.add(capturedPiece); //...and returns to the list of pieces on the board
        }
    }

    //Checks if there is a piece in the source position
    private void validateSourcePosition(Position position) {
        if (!board.thereIsAPiece(position)) {
            throw new ChessException("There is no piece on source position");
        }
        if (currentPlayer != ((ChessPiece) board.piece(position)).getColor()) {
            throw new ChessException("The chosen piece is not yours");
        }
        if (!board.piece(position).isThereAnyPossibleMove()) {
            throw new ChessException("There is no possible moves for the chosen piece");
        }
    }

    //Checks if there is a piece in the target position
    private void validateTargetPosition(Position source, Position target) {
        if (!board.piece(source).possibleMove(target)) {
            throw new ChessException("The chosen piece can't move to target position");
        }
    }

    //Change the turn and the player
    private void nextTurn() {
        turn++;
        currentPlayer = (currentPlayer == Color.WHITE) ? Color.BLACK : Color.WHITE;
    }

    //Indicates the opponent's color of the current player
    private Color opponent(Color color) {
        return (color == Color.WHITE) ? Color.BLACK : Color.WHITE;
    }

    //Filters the list of pieces in the game and finds the king of a certain color
    private ChessPiece king(Color color) {
        List<Piece> list = piecesOnTheBoard.stream().filter(x -> ((ChessPiece) x).getColor() == color).collect(Collectors.toList());
        for (Piece p : list) {
            if (p instanceof King) {
                return (ChessPiece) p;
            }
        }
        throw new IllegalStateException("There is no " + color + " king on the board");
    }

    /*
     * To test whether the King of a certain color is in check
     * it will be necessary to go through all the opposing pieces and check for each one
     * if there is a possible movement that culminates in the King's square
     */
    private boolean testCheck(Color color) {
        Position kingPosition = king(color).getChessPosition().toPosition(); //Identifies the king's chess position
        //Lists opponent's pieces of the indicated color
        List<Piece> opponentPieces = piecesOnTheBoard.stream().filter(x -> ((ChessPiece) x).getColor() == opponent(color)).collect(Collectors.toList());
        /* Go through all the pieces and check their possible movements,
         * if one culminates in the king, he is in check */
        for (Piece p : opponentPieces) {
            boolean[][] mat = p.possibleMoves();
            if (mat[kingPosition.getRow()][kingPosition.getColumn()]) {
                return true;
            }
        }
        return false;
    }

    /*
     * Checkmate occurs when the king is in check and there is no possible movement of any piece
     * of his color that can take him out of the check
     */
    private boolean testCheckMate(Color color) {
        if (!testCheck(color)) { //If the King is not in check he will also not be in checkmate
            return false;
        }
        //Take all the pieces of that color and check if it has any movement that takes the king out of check
        List<Piece> list = piecesOnTheBoard.stream().filter(x -> ((ChessPiece) x).getColor() == color).collect(Collectors.toList());
        for (Piece p : list) {
            boolean[][] mat = p.possibleMoves(); //Creates an matrix of possible piece moves
            for (int i = 0; i < board.getRows(); i++) { //Scrolls across the board
                for (int j = 0; j < board.getColumns(); j++) {
                    if (mat[i][j]) {
                        Position source = ((ChessPiece) p).getChessPosition().toPosition();
                        Position target = new Position(i, j);
                        Piece capturedPiece = makeMove(source, target); //Moves the piece
                        boolean testCheck = testCheck(color); //Checks whether the king remains in check after the move
                        undoMove(source, target, capturedPiece); //Undo the movement
                        if (!testCheck) { //If the king is no longer in check, returns false
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    //Put the piece in the game
    private void placeNewPiece(char column, int row, ChessPiece piece) {
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
        piecesOnTheBoard.add(piece);
    }

    //Starts the game by placing the pieces on the board
    private void initialSetup() {
        placeNewPiece('h', 7, new Rook(board, Color.WHITE));
        placeNewPiece('d', 1, new Rook(board, Color.WHITE));
        placeNewPiece('e', 1, new King(board, Color.WHITE));

        placeNewPiece('b', 8, new Rook(board, Color.BLACK));
        placeNewPiece('a', 8, new King(board, Color.BLACK));
    }

}