package be.ordina.rest.dto;

import be.ordina.rest.model.Color;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UpdateGameDTO {
    private final Integer amountOfPoints;
    private final Color color;
}
