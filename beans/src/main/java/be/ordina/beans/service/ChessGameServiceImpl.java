package be.ordina.beans.service;

import be.ordina.beans.model.Game;
import be.ordina.beans.model.Location;
import be.ordina.beans.model.Piece;
import be.ordina.beans.model.Player;
import be.ordina.beans.repo.ChessGameRepository;
import org.springframework.stereotype.Component;

import java.util.Map;

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
        var game = Game.builder()
                .white(new Player("Julia"))
                .black(new Player("Romeo"))
                .board(board)
                .build();
        return chessGameRepository.saveGame(game);
    }
}
