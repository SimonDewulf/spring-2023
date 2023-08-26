package be.ordina.test;

import be.ordina.test.config.Config;
import be.ordina.test.dto.piece.PieceDto;
import be.ordina.test.mapper.PieceMapperSelector;
import be.ordina.test.model.Color;
import be.ordina.test.model.piece.Bishop;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = Config.class)
public class SelectorTest {

    @Autowired
    private PieceMapperSelector pieceMapperSelector;

    @Test
    void testPieceMapping() {
        var piece = new Bishop(Color.WHITE);
        var expected = PieceDto.builder()
                .color(Color.WHITE)
                .pieceName("BISHOP")
                .build();

        var result = pieceMapperSelector.pieceToPieceDto(piece);

        assertEquals(expected, result);
    }
}
