package be.ordina.test.mapper;

import be.ordina.test.dto.piece.PieceDto;
import be.ordina.test.model.piece.Piece;
import be.ordina.test.model.piece.Queen;
import org.springframework.stereotype.Component;

@Component
class QueenMapper implements PieceMapper<Queen> {
    @Override
    public boolean applies(Piece piece) {
        return piece instanceof Queen;
    }

    @Override
    public PieceDto pieceToPieceDto(Queen piece) {
        return PieceDto.builder()
                .color(piece.getColor())
                .pieceName("QUEEN")
                .build();
    }
}
