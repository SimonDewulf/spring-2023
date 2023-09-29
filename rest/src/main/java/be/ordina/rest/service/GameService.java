package be.ordina.rest.service;

import be.ordina.rest.model.Color;
import be.ordina.rest.model.Game;

import java.util.UUID;

public interface GameService {

    Game createGame(Integer blackPoints, Integer whitePoints);

    Game updatePoints(UUID gameId, Color color, Integer newAmountOfPoints);

    void deleteGame(UUID gameId);

    Game findGameById(UUID gameId);
}
