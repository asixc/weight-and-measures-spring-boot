package dev.jotxee.weightandmeasures.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import static java.lang.String.format;

@ControllerAdvice
public class GeneralException {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleCustomException(Exception ex) {
        // Lógica para manejar la excepción y proporcionar una respuesta personalizada
        return new ResponseEntity<>(format("An error has been found: [%s]", ex.getMessage()), HttpStatus.BAD_REQUEST);
    }

}
