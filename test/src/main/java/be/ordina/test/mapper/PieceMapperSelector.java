package be.ordina.test.mapper;

import be.ordina.test.dto.piece.PieceDto;
import be.ordina.test.model.piece.Piece;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PieceMapperSelector {

    private final List<PieceMapper> pieceMappers;

    public PieceDto pieceToPieceDto(Piece piece) {
        return pieceMappers.stream()
                .filter(pieceMapper -> pieceMapper.applies(piece))
                .findFirst()
                .map(mapper -> mapper.pieceToPieceDto(piece))
                .orElseThrow(IllegalStateException::new);
    }

}
