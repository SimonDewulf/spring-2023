package be.ordina.client;

import be.ordina.client.clients.GameClient;
import be.ordina.client.dto.CreateGameDTO;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ClientApplicationTests {

    @Autowired
    private GameClient gameClient;

    @Test
    void createGame() {
        var createGame = CreateGameDTO.builder()
                .blackPoints(5)
                .whitePoints(88)
                .build();
        var savedGame = gameClient.createGame(createGame);
        var retrievedGame = gameClient.getGame(savedGame.getId());0

        assertAll(
                () -> assertEquals(88, savedGame.getWhitePoints()),
                () -> assertEquals(88, retrievedGame.getWhitePoints()),
                () -> assertEquals(5, savedGame.getBlackPoints()),
                () -> assertEquals(5, retrievedGame.getBlackPoints()),
                () -> assertEquals(savedGame.getId(), retrievedGame.getId()),
                () -> assertEquals(savedGame, retrievedGame)
        );

    }

}
