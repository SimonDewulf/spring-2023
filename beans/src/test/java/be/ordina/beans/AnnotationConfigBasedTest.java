package be.ordina.beans;

import be.ordina.beans.repo.ChessGameRepository;
import be.ordina.beans.service.ChessGameService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
public class AnnotationConfigBasedTest {

    @Test
    void testApplicationContext() {
        var context = new AnnotationConfigApplicationContext(Config.class);

        assertAll(
                () -> assertNotNull(context.getBean(ChessGameRepository.class)),
                () -> assertNotNull(context.getBean(ChessGameService.class)),
                () -> assertNotNull(context.getBean("chessBoard"))
        );
    }
}
