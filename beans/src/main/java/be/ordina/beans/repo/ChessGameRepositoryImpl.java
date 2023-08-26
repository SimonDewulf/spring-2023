package be.ordina.beans.repo;

import be.ordina.beans.model.Game;

public class ChessGameRepositoryImpl implements ChessGameRepository {

    @Override
    public Game saveGame(Game game) {
        return game;
    }
}
