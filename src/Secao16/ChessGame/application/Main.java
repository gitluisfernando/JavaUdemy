package Secao16.ChessGame.application;

import java.util.Scanner;

import Secao16.ChessGame.chess.ChessMatch;
import Secao16.ChessGame.chess.ChessPiece;
import Secao16.ChessGame.chess.ChessPosition;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(sc);
            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
        }


    }

}