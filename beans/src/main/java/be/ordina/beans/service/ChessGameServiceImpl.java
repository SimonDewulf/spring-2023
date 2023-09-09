package be.ordina.beans.service;

import be.ordina.beans.model.Game;
import be.ordina.beans.model.Location;
import be.ordina.beans.model.Piece;
import be.ordina.beans.model.Player;
import be.ordina.beans.repo.ChessGameRepository;
import org.springframework.stereotype.Component;

import java.util.Map;
import static be.ordina.beans.config.BoardConfig.board;
import static be.ordina.beans.config.GameConfig.game;

@Component
public class ChessGameServiceImpl implements ChessGameService {

    private final ChessGameRepository chessGameRepository;
    private final Map<Location, Piece> board;

    public ChessGameServiceImpl(ChessGameRepository chessGameRepository,
                                Map<Location, Piece> board) {
        this.chessGameRepository = chessGameRepository;
        this.board = board;
    }

    public Game createGame() {
        var newGame = game(board);
        return chessGameRepository.saveGame(newGame);
    }
}
