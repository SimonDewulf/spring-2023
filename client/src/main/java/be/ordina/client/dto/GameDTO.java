package be.ordina.client.dto;

import lombok.*;

import java.util.UUID;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
@EqualsAndHashCode
public class GameDTO {
    private UUID id;
    private Integer whitePoints;
    private Integer blackPoints;
}
