package org.aibles.configserver.exception;

import org.springframework.http.HttpStatus;

public class IdNotFoundException extends BaseExceptionRequest{

  public IdNotFoundException(String id) {
    setStatus(HttpStatus.NOT_FOUND.value());
    setCode("org.aibles.configserver.exception.IdNotFoundException");
    addParams("id", id);
  }
}
