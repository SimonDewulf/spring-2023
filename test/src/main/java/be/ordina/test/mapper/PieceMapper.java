package be.ordina.test.mapper;

import be.ordina.test.dto.piece.PieceDto;
import be.ordina.test.model.piece.Piece;

public interface PieceMapper<T extends Piece> {

    boolean applies(Piece piece);

    PieceDto pieceToPieceDto(T piece);
}
