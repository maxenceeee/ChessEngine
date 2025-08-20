package fr.xamence.chessengine.pieces;

import fr.xamence.chessengine.Board;
import fr.xamence.chessengine.Move;

public abstract class Piece {

    private final Board board;

    // Position
    private byte column;
    private byte row;

    private final String name;
    private final boolean isWhite;

    public Piece(Board board, byte column, byte row, boolean isWhite,String name) {
        this.board = board;
        this.column = column;
        this.row = row;
        this.name = name;
        this.isWhite = isWhite;
    }

    public byte getColumn() {
        return column;
    }

    public void setColumn(byte column) {
        this.column = column;
    }

    public byte getRow() {
        return row;
    }

    public void setRow(byte row) {
        this.row = row;
    }

    public String getName() {
        return name;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public Board getBoard() {
        return board;
    }

    public abstract boolean isValidMove(Move move);

}
