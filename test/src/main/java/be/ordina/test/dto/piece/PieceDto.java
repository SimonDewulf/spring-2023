package be.ordina.test.dto.piece;


import be.ordina.test.model.Color;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Builder
@Getter
@EqualsAndHashCode
public class PieceDto {
    protected final Color color;
    protected final String pieceName;
}
