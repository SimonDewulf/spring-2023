package be.ordina.rest;

import be.ordina.rest.advice.GeneralControllerAdvice;
import be.ordina.rest.controller.GameController;
import be.ordina.rest.exception.NotFoundException;
import be.ordina.rest.model.Game;
import be.ordina.rest.service.GameService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import java.util.UUID;

@ExtendWith(MockitoExtension.class)
public class GameControllerUnitTest {

    @InjectMocks
    private GameController gameController;

    @Mock
    private GameService gameService;

    private MockMvc mockMvc;

    @BeforeEach
    public void setup() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(gameController)
                .setControllerAdvice(GeneralControllerAdvice.class)
                .build();
    }

    @Test
    void deleteGame() throws Exception {
        var id = UUID.randomUUID();
        mockMvc.perform(MockMvcRequestBuilders.delete("/game/" + id))
                .andExpect(status().isAccepted());

        Mockito.verify(gameService).deleteGame(id);
        Mockito.verifyNoMoreInteractions(gameService);
    }

    @Test
    void postGame() throws Exception {
        when(gameService.createGame(any(), any())).thenReturn(Game.builder()
                        .blackPoints(8)
                        .whitePoints(5)
                .build());
        mockMvc.perform(MockMvcRequestBuilders.post("/game/")
                        .content("""
                                {
                                "whitePoints": 5,
                                "blackPoints": 8
                                }
                                """)
                        .accept(MediaType.ALL)
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk());

        Mockito.verify(gameService).createGame(8, 5);
        Mockito.verifyNoMoreInteractions(gameService);
    }

    @Test
    void findById_gameNotFound_shouldHandleGameNotFoundException() throws Exception {
        var id = UUID.randomUUID();
        when(gameService.findGameById(id)).thenThrow(NotFoundException.class);
        mockMvc.perform(get("/game/" + id))
                .andExpect(status().isNotFound());
    }
}
