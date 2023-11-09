package dev.jotxee.weightandmeasures.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GeneralException {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleCustomException(Exception ex) {
        // Lógica para manejar la excepción y proporcionar una respuesta personalizada
        return new ResponseEntity<>("Ocurrió un error: " + ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

}
