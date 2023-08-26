package be.ordina.test.service;

import be.ordina.test.model.piece.Piece;

import java.util.List;

public interface PieceService {
    public List<Piece> getLivingPieces();
}
