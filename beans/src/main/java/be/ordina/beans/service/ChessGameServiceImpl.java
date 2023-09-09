package be.ordina.beans.service;

import be.ordina.beans.model.Game;
import be.ordina.beans.repo.ChessGameRepository;

import static be.ordina.beans.config.BoardConfig.board;
import static be.ordina.beans.config.GameConfig.game;

public class ChessGameServiceImpl implements ChessGameService {

    private final ChessGameRepository chessGameRepository;

    public ChessGameServiceImpl(ChessGameRepository chessGameRepository) {
        this.chessGameRepository = chessGameRepository;
    }

    public Game createGame() {
        var newGame = game(board());
        return chessGameRepository.saveGame(newGame);
    }
}
