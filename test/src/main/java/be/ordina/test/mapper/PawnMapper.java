package be.ordina.test.mapper;

import be.ordina.test.dto.piece.PieceDto;
import be.ordina.test.model.piece.Pawn;
import be.ordina.test.model.piece.Piece;
import org.springframework.stereotype.Component;

@Component
public class PawnMapper implements PieceMapper<Pawn> {
    @Override
    public boolean applies(Piece piece) {
        return piece instanceof Pawn;
    }

    @Override
    public PieceDto pieceToPieceDto(Pawn piece) {
        return PieceDto.builder()
                .color(piece.getColor())
                .pieceName("PAWN")
                .build();
    }
}
