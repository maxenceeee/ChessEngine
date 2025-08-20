package fr.xamence.chessengine.pieces;

import fr.xamence.chessengine.Board;
import fr.xamence.chessengine.Move;

public class Pawn extends Piece{

    public Pawn(Board board, byte column, byte row, boolean isWhite) {
        super(board, column, row, isWhite, "Pawn");

    }

    @Override
    public boolean isValidMove(Move move) {
        byte moveY = (byte) (move.getNewRow() - move.getCurrentRow());

        if ((isWhite() && moveY >= 1) || (!isWhite() && moveY <= -1)) {

            moveY = (byte) Math.abs(moveY);
            byte moveX = (byte) Math.abs(move.getNewColumn() - move.getCurrentColumn());

            if(move.getCapturedPiece() != null) {
                return move.getNewColumn() != move.getCurrentColumn() && moveY == 1 && moveX == 1;
            }

            if (moveX == 0) {
                if (isFirstMove() && moveY == 2)
                    return true;
                else return moveY == 1;
            }
        }
        return false;
    }

    public boolean isFirstMove(){
        byte firstRow = (byte) (isWhite() ? 2 : 7);
        return firstRow == this.getRow();
    }
}
