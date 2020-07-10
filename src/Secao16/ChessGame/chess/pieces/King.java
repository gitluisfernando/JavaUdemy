package Secao16.ChessGame.chess.pieces;

import Secao16.ChessGame.boardgame.Board;
import Secao16.ChessGame.chess.ChessPiece;
import Secao16.ChessGame.chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }

}