package be.ordina.rest.advice;

import be.ordina.rest.dto.ErrorDto;
import be.ordina.rest.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.LocalDateTime;

@ControllerAdvice
public class GeneralControllerAdvice {
    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorDto handleNotFoundException(NotFoundException e) {
        return ErrorDto.builder()
                .localDateTime(LocalDateTime.now())
                .message(e.getMessage())
                .build();
    }
}