package be.ordina.client.dto;

import lombok.Builder;
import lombok.Getter;
import model.Color;

@Builder
@Getter
public class UpdateGameDTO {
    private final Integer amountOfPoints;
    private final Color color;
}
