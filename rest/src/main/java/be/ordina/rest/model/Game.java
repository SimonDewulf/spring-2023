package be.ordina.rest.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Builder
public class Game {
    private UUID id;
    @Setter
    private Integer whitePoints;
    @Setter
    private Integer blackPoints;
}
