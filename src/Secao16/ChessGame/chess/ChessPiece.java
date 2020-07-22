package Secao16.ChessGame.chess;

import Secao16.ChessGame.boardgame.Board;
import Secao16.ChessGame.boardgame.Piece;
import Secao16.ChessGame.boardgame.Position;

public abstract class ChessPiece extends Piece {

    private Color color;
    private int moveCount;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public void increaseMoveCount() {
        moveCount++;
    }

    public void decreaseMoveCount() {
        moveCount--;
    }

    //Returns a position in the format of the chess game (a1, h8)
    public ChessPosition getChessPosition() {
        return ChessPosition.fromPosition(position);
    }

    //Checks if there is an opponent's piece in a given square of the board
    protected boolean isThereOpponentPiece(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;
    }

}