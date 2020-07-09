package Secao16.ChessGame.application;

import Secao16.ChessGame.chess.ChessMatch;

public class Main {

    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }

}