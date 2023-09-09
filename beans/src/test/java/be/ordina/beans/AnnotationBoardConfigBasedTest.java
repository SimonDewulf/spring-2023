package be.ordina.beans;

import be.ordina.beans.config.GameConfig;
import be.ordina.beans.repo.ChessGameRepository;
import be.ordina.beans.service.ChessGameService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AnnotationBoardConfigBasedTest {

    //todo make this test pass

    @Test
    void testApplicationContext() {
        var context = new AnnotationConfigApplicationContext(GameConfig.class);

        assertAll(
                () -> assertNotNull(context.getBean(ChessGameRepository.class)),
                () -> assertNotNull(context.getBean(ChessGameService.class)),
                () -> assertNotNull(context.getBean("chessBoard")),
                () -> assertNotNull(context.getBean("game")),
                () -> assertNotNull(context.getBean("boardConfig")),
                () -> assertNotNull(context.getBean("gameConfig"))
        );
    }
}
