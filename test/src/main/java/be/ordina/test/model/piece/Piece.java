package be.ordina.test.model.piece;


import be.ordina.test.model.Color;
import lombok.Getter;

public abstract class Piece {
    @Getter
    private final Color color;

    public Piece(Color color) {
        this.color = color;
    }
}
