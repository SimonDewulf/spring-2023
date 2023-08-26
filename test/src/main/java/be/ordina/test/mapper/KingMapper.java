package be.ordina.test.mapper;

import be.ordina.test.dto.piece.PieceDto;
import be.ordina.test.model.piece.King;
import be.ordina.test.model.piece.Piece;
import org.springframework.stereotype.Component;

@Component
public class KingMapper implements PieceMapper<King> {
    @Override
    public boolean applies(Piece piece) {
        return piece instanceof King;
    }

    @Override
    public PieceDto pieceToPieceDto(King piece) {
        return PieceDto.builder()
                .color(piece.getColor())
                .pieceName("KING")
                .build();
    }
}
