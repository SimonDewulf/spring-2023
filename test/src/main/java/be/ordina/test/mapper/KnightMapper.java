package be.ordina.test.mapper;

import be.ordina.test.dto.piece.PieceDto;
import be.ordina.test.model.piece.Knight;
import be.ordina.test.model.piece.Piece;
import org.springframework.stereotype.Component;

@Component
public class KnightMapper implements PieceMapper<Knight> {
    @Override
    public boolean applies(Piece piece) {
        return piece instanceof Knight;
    }

    @Override
    public PieceDto pieceToPieceDto(Knight piece) {
        return PieceDto.builder()
                .color(piece.getColor())
                .pieceName("KNIGHT")
                .build();
    }
}
