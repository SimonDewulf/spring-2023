package be.ordina.beans.service;

import be.ordina.beans.model.Game;
import be.ordina.beans.repo.ChessGameRepository;
import org.springframework.stereotype.Component;

@Component
public class ChessGameServiceImpl implements ChessGameService {

    private final ChessGameRepository chessGameRepository;
    private final Game game;

    public ChessGameServiceImpl(ChessGameRepository chessGameRepository,
                                Game game) {
        this.chessGameRepository = chessGameRepository;
        this.game = game;
    }

    public Game createGame() {
        return chessGameRepository.saveGame(game);
    }
}
