package com.exception_handling.webApi;

import com.exception_handling.domain.User;

import java.util.Objects;

public class UserWebApiMapper {

  public static User of(final AddUserCommand addUserCommand) {
    return new User(null, addUserCommand.username(), addUserCommand.password(), null);
  }

  public static UserDto of(final User user) {
    return new UserDto(Objects.requireNonNull(user.getId()).toString(), user.getUsername());
  }

}
