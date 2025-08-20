package fr.xamence.chessengine.pieces;

import fr.xamence.chessengine.Board;
import fr.xamence.chessengine.Move;

public class Knight extends Piece{

    public Knight(Board board, byte column, byte row, boolean isWhite) {
        super(board, column, row, isWhite, "Knight");
    }

    @Override
    public boolean isValidMove(Move move) {
        byte moveX = (byte) Math.abs(move.getNewColumn() - move.getCurrentColumn());
        byte moveY = (byte) Math.abs(move.getNewRow() - move.getCurrentRow());

        return (moveX == 2 && moveY == 1) || (moveX == 1 && moveY == 2);
    }
}
