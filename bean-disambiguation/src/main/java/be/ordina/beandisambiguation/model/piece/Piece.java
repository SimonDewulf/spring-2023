package be.ordina.beandisambiguation.model.piece;


import be.ordina.beandisambiguation.model.Color;
import lombok.Getter;

public abstract class Piece {
    @Getter
    private final Color color;

    public Piece(Color color) {
        this.color = color;
    }
}
