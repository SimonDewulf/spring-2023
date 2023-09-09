package be.ordina.beans.config;

import be.ordina.beans.model.Location;
import be.ordina.beans.model.Piece;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ComponentScan("be.ordina.beans")
public class Config {
public class BoardConfig {

    @Bean
    public Map<Location, Piece> chessBoard() {
        var board = new HashMap<Location, Piece>();
        board.put(Location.builder()
                        .x("A")
                        .y("1")
                        .build(),
                Piece.builder().name("Rook")
                        .color("White")
                        .build());

        return board;
    }
}
