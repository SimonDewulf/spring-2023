package be.ordina.client.dto;

import lombok.*;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class CreateGameDTO {
    private Integer whitePoints;
    private Integer blackPoints;
}
