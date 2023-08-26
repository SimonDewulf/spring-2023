package be.ordina.test.mapper;

import be.ordina.test.dto.piece.PieceDto;
import be.ordina.test.model.piece.Bishop;
import be.ordina.test.model.piece.Piece;
import org.springframework.stereotype.Component;

@Component
class BishopMapper implements PieceMapper<Bishop> {
    @Override
    public boolean applies(Piece piece) {
        return piece instanceof Bishop;
    }

    @Override
    public PieceDto pieceToPieceDto(Bishop piece) {
        return PieceDto.builder()
                .color(piece.getColor())
                .pieceName("BISHOP")
                .build();
    }
}
