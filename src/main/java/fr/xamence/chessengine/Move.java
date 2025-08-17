package fr.xamence.chessengine;

import fr.xamence.chessengine.pieces.Piece;

public class Move {

    private final Piece piece;
    private final byte currentRow;
    private final byte currentColumn;
    private final byte newRow;
    private final byte newColumn;

    private final Piece capturedPiece;

    public Move(Piece piece, byte currentRow, byte currentColumn, byte newRow, byte newColumn) {
        this.piece = piece;
        this.currentRow = currentRow;
        this.currentColumn = currentColumn;
        this.newRow = newRow;
        this.newColumn = newColumn;

        this.capturedPiece = piece.getBoard().getPieceAt(newRow, newColumn);
    }

    public Piece getPiece() {
        return piece;
    }

    public byte getCurrentRow() {
        return currentRow;
    }

    public byte getCurrentColumn() {
        return currentColumn;
    }

    public byte getNewRow() {
        return newRow;
    }

    public byte getNewColumn() {
        return newColumn;
    }

    public Piece getCapturedPiece() {
        return capturedPiece;
    }
}
