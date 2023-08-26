package be.ordina.beans.service;

import be.ordina.beans.model.Game;
import be.ordina.beans.model.Location;
import be.ordina.beans.model.Piece;
import be.ordina.beans.model.Player;
import be.ordina.beans.repo.ChessGameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class ChessGameServiceImpl implements ChessGameService {

    private final Map<Location, Piece> board;
    private final ChessGameRepository chessGameRepository;

    public Game createGame() {
        var game = Game.builder()
                .white(new Player("Julia"))
                .black(new Player("Romeo"))
                .board(board)
                .build();
        return chessGameRepository.saveGame(game);
    }
}
