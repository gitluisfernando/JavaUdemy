package Secao16.ChessGame.chess;

import Secao16.ChessGame.boardgame.Board;
import Secao16.ChessGame.boardgame.Piece;
import Secao16.ChessGame.boardgame.Position;

public abstract class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    //Checks if there is an opponent's piece in a given square of the board
    protected boolean isThereOpponentPiece(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;
    }

}