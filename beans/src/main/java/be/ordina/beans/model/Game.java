package be.ordina.beans.model;

import lombok.Builder;

import java.util.Map;

@Builder
public class Game {
    private final Map<Location, Piece> board;
    private final Player white;
    private final Player black;

}
