package be.ordina.test.controller;

import be.ordina.test.dto.piece.PieceDto;
import be.ordina.test.mapper.PieceMapperSelector;
import be.ordina.test.service.PieceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PieceController {

    private final PieceMapperSelector pieceMapperSelector;
    private final PieceService pieceService;

    public List<PieceDto> getPieces() {
        return pieceService.getLivingPieces()
                .stream()
                .map(pieceMapperSelector::pieceToPieceDto)
                .toList();
    }
}
