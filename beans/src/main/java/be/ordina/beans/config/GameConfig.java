package be.ordina.beans.config;

import be.ordina.beans.model.Game;
import be.ordina.beans.model.Piece;
import be.ordina.beans.model.Player;
import be.ordina.beans.model.Location;

import java.util.Map;

public class GameConfig {

    public static Game game(Map<Location, Piece> board) {
        return Game.builder()
                .board(board)
                .white(Player.builder()
                        .name("Johnny")
                        .build())
                .black(Player.builder()
                        .name("Marina")
                        .build())
                .build();
    }
}
