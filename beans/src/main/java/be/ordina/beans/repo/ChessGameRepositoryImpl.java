package be.ordina.beans.repo;

import be.ordina.beans.model.Game;
import org.springframework.stereotype.Component;

@Component
public class ChessGameRepositoryImpl implements ChessGameRepository {

    @Override
    public Game saveGame(Game game) {
        return game;
    }
}
