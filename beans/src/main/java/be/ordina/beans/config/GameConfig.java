package be.ordina.beans.config;

import be.ordina.beans.model.Game;
import be.ordina.beans.model.Location;
import be.ordina.beans.model.Piece;
import be.ordina.beans.model.Player;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.Map;

@Configuration
@Import(BoardConfig.class)
@ComponentScan("be.ordina.beans")
public class GameConfig {

    @Bean
    public Game game(Map<Location, Piece> board) {
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
