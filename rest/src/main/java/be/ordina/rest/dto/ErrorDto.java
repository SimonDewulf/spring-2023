package be.ordina.rest.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class ErrorDto {
    private LocalDateTime localDateTime;
    private String message;
}
