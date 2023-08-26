package be.ordina.test;

import be.ordina.test.config.Config;
import be.ordina.test.controller.PieceController;
import be.ordina.test.model.Color;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = Config.class)
public class ControllerTest {

    @Autowired
    private PieceController pieceController;
    @Test
    void getPieces() {
        var result = pieceController.getPieces();

        assertAll(
                () -> assertEquals(5, result.size()),
                () -> assertEquals(3, result.stream().filter(p -> p.getColor().equals(Color.BLACK)).toList().size()),
                () -> assertEquals(2, result.stream().filter(p -> p.getColor().equals(Color.WHITE)).toList().size()),
                () -> assertEquals(2, result.stream().filter(p -> p.getPieceName().equals("KING")).toList().size()),
                () -> assertEquals(1, result.stream().filter(p -> p.getPieceName().equals("QUEEN")).toList().size()),
                () -> assertEquals(1, result.stream().filter(p -> p.getPieceName().equals("ROOK")).toList().size()),
                () -> assertEquals(1, result.stream().filter(p -> p.getPieceName().equals("BISHOP")).toList().size())
        );
    }
}
