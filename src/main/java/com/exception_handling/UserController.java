package com.exception_handling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Objects;

@Controller
public class UserController {

  @Autowired
  UserService userService;

  @RequestMapping(value = "/user", method = RequestMethod.POST)
  public ResponseEntity<UserDto> addUser(@RequestBody AddUserCommand addUserCommand) {
    var saved = userService.addUser(UserWebApiMapper.of(addUserCommand));
    if (Objects.nonNull(saved.getId()))
      return new ResponseEntity<>(UserWebApiMapper.of(saved), HttpStatus.CREATED);
    else
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
  }

}
