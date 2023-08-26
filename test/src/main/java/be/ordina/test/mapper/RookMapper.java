package be.ordina.test.mapper;

import be.ordina.test.dto.piece.PieceDto;
import be.ordina.test.model.piece.Piece;
import be.ordina.test.model.piece.Rook;
import org.springframework.stereotype.Component;

@Component
public class RookMapper implements PieceMapper<Rook> {
    @Override
    public boolean applies(Piece piece) {
        return piece instanceof Rook;
    }

    @Override
    public PieceDto pieceToPieceDto(Rook piece) {
        return PieceDto.builder()
                .color(piece.getColor())
                .pieceName("ROOK")
                .build();
    }
}
