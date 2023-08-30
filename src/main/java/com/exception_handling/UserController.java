package com.exception_handling;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

  @RequestMapping(value = "/home", method = RequestMethod.GET)
  public ResponseEntity<Object> getListProduct() {
    throw DuplicateEntity.product("nintendo switch");
  }

}
