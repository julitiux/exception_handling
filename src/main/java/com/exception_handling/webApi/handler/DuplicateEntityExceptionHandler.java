package com.exception_handling.webApi.handler;

import com.exception_handling.domain.DuplicateEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Map;

@ControllerAdvice
public class DuplicateEntityExceptionHandler {

  @ExceptionHandler(value = DuplicateEntity.class)
  public ResponseEntity<Object> exception(DuplicateEntity exception) {
    final var body = Map.of(
      "message", exception.getMessage(),
      "entity", exception.getEntityName(),
      "duplicatedId", exception.getEntityId()
    );
    return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
  }

}