package be.ordina.rest.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.UUID;
@Builder
@Getter
public class GameDTO {
    private UUID id;
    private Integer whitePoints;
    private Integer blackPoints;
}
