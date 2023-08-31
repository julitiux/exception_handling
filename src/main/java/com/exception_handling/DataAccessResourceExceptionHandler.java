package com.exception_handling;

import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Map;

@ControllerAdvice
public class DataAccessResourceExceptionHandler {

  @ExceptionHandler(value = DataAccessException.class)
  public ResponseEntity<Object> exception(DataAccessException exception) {
    final var body = Map.of(
      "message", exception.getMessage()
    );
    return new ResponseEntity<>(body, HttpStatus.INTERNAL_SERVER_ERROR);
  }

}
