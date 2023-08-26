package be.ordina.beans.config;

import be.ordina.beans.model.Location;
import be.ordina.beans.model.Piece;

import java.util.HashMap;
import java.util.Map;

public class Config {

    public static Map<Location, Piece> board() {
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
