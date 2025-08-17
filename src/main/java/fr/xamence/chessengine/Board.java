package fr.xamence.chessengine;

import fr.xamence.chessengine.pieces.Piece;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private final byte columnsSize;
    private final byte rowsSize;

    private List<Piece> piecesList;

    public Board(byte columnsSize, byte rowsSize) {
        this.columnsSize = columnsSize;
        this.rowsSize = rowsSize;

        this.piecesList = new ArrayList<>();
    }

    public Piece getPieceAt(byte column, byte row) {
        return this.piecesList.stream().filter(piece -> piece.getColumn() == column && piece.getRow() == row).findAny().orElse(null);
    }

    public boolean isValidMove(Move move) {



        return true;
    }

    public void makeMove(Move move) {
        Piece movedPiece = move.getPiece();

        movedPiece.setColumn(move.getNewColumn());
        movedPiece.setRow(move.getNewRow());
    }

    public void applyCapture(Move move) {
        this.piecesList.remove(move.getCapturedPiece());
    }

    public boolean isInSameTeam(Piece p1, Piece p2) {
        if (p1 == null || p2 == null)
            return false;

        return !(p1.isWhite() ^ p2.isWhite());
    }

}
