package Secao16.ChessGame.chess.pieces;

import Secao16.ChessGame.boardgame.Board;
import Secao16.ChessGame.chess.ChessPiece;
import Secao16.ChessGame.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }

    @Override
    public boolean[][] possibleMoves() {
        //Creates a Boolean Matrix the same size as the board
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }

}