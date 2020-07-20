package Secao16.ChessGame.chess;

import Secao16.ChessGame.boardgame.Position;

//This class defines the game positions between A1 and H8
public class ChessPosition {

    private Character column;
    private Integer row;

    public ChessPosition(Character column, Integer row) {
        if (column < 'a' || column > 'h' || row < 1 || row > 8) {
            throw new ChessException("Error instantiating ChessPosition: Valid values are from a1 to h8");
        }
        this.column = column;
        this.row = row;
    }

    public Character getColumn() {
        return column;
    }

    public Integer getRow() {
        return row;
    }

    //Returns the position of the piece in the game
    protected Position toPosition() {
        return new Position(8 - row, column - 'a');
    }

    //Given a position in the matrix, it converts to position of the game
    protected static ChessPosition fromPosition(Position position) {
        return new ChessPosition((char)('a' + position.getColumn()), 8 - position.getRow());
    }

    @Override
    public String toString() {
        return "" + column + row;
    }
}