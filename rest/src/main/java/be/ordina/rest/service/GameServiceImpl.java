package be.ordina.rest.service;

import be.ordina.rest.exception.GameNotFoundException;
import be.ordina.rest.model.Color;
import be.ordina.rest.model.Game;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Optional;
import java.util.UUID;

@Service
class GameServiceImpl implements GameService {

    private final HashMap<UUID, Game> games = new HashMap<>();

    @Override
    public Game createGame(Integer blackpoints, Integer whitePoints) {
        var game = Game.builder()
                .id(UUID.randomUUID())
                .blackPoints(blackpoints)
                .whitePoints(whitePoints)
                .build();
        games.put(game.getId(), game);
        return game;
    }

    @Override
    public Game updatePoints(UUID gameId, Color color, Integer newAmountOfPoints) {
        var game = games.get(gameId);

        if (game == null) {
            throw new GameNotFoundException(String.format("game with id: %s does not exist", gameId.toString()));
        }

        switch (color) {
            case WHITE -> game.setWhitePoints(newAmountOfPoints);
            case BLACK -> game.setBlackPoints(newAmountOfPoints);
        }
        return game;
    }

    @Override
    public void deleteGame(UUID gameId) {
        games.remove(gameId);
    }

    @Override
    public Game findGameById(UUID gameId) {
        return Optional.ofNullable(games.get(gameId))
                .orElseThrow(() -> new GameNotFoundException(String.format("game with id: %s does not exist", gameId.toString())));
    }
}
