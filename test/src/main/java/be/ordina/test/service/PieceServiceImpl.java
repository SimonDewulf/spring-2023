package be.ordina.test.service;

import be.ordina.test.model.Color;
import be.ordina.test.model.piece.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PieceServiceImpl implements PieceService {

    public List<Piece> getLivingPieces() {
        return List.of(new Queen(Color.BLACK), new Rook(Color.WHITE), new Bishop(Color.BLACK), new King(Color.WHITE), new King(Color.BLACK));
    }
}
