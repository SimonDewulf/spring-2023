package be.ordina.rest.controller;

import be.ordina.rest.dto.CreateGameDTO;
import be.ordina.rest.dto.GameDTO;
import be.ordina.rest.dto.UpdateGameDTO;
import be.ordina.rest.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/game")
@RequiredArgsConstructor
public class GameController {

    private final GameService gameService;

    @GetMapping("/{id}")
    public GameDTO getGame(@PathVariable UUID id) {
        var game = gameService.findGameById(id);
        return GameDTO.builder()
                .id(game.getId())
                .blackPoints(game.getBlackPoints())
                .whitePoints(game.getWhitePoints())
                .build();
    }

    @PostMapping
    public GameDTO createGame(@RequestBody CreateGameDTO createGameDTO) {
        var newGame = gameService.createGame(createGameDTO.getBlackPoints(), createGameDTO.getWhitePoints());
        return GameDTO.builder()
                .id(newGame.getId())
                .blackPoints(newGame.getBlackPoints())
                .whitePoints(newGame.getWhitePoints())
                .build();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteGame(@PathVariable UUID id) {
        gameService.deleteGame(id);
    }

    @PutMapping("/{id}")
    public GameDTO updateGame(@PathVariable UUID id, @RequestBody UpdateGameDTO updateGameDTO) {
        var updatedGame = gameService.updatePoints(id ,updateGameDTO.getColor(), updateGameDTO.getAmountOfPoints());
        return GameDTO.builder()
                .id(updatedGame.getId())
                .whitePoints(updatedGame.getWhitePoints())
                .blackPoints(updatedGame.getBlackPoints())
                .build();
    }
}
