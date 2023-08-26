package be.ordina.test.dto.piece;


import be.ordina.test.model.Color;
import lombok.Builder;

@Builder
public class PieceDto {
    protected final Color color;
    protected final String pieceName;
}
