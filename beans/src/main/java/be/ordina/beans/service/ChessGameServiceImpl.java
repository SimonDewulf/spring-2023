package be.ordina.beans.service;

import be.ordina.beans.model.Game;
import be.ordina.beans.model.Player;
import be.ordina.beans.repo.ChessGameRepository;
import be.ordina.beans.repo.ChessGameRepositoryImpl;

import static be.ordina.beans.Config.board;

public class ChessGameServiceImpl implements ChessGameService {

    private final ChessGameRepository chessGameRepository;

    public ChessGameServiceImpl() {
        this.chessGameRepository = new ChessGameRepositoryImpl();
    }

    public Game createGame() {
        var game = Game.builder()
                .white(new Player("Julia"))
                .black(new Player("Romeo"))
                .board(board())
                .build();
        return chessGameRepository.saveGame(game);
    }
}
