package be.ordina.beans.repo;

import be.ordina.beans.model.Game;

public interface ChessGameRepository {

    Game saveGame(Game game);
}
