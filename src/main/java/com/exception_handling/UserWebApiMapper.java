package com.exception_handling;

import java.util.Objects;

public class UserWebApiMapper {

  public static User of(final AddUserCommand addUserCommand) {
    return new User(null, addUserCommand.username(), addUserCommand.password(), null);
  }

  public static UserDto of(final User user) {
    return new UserDto(Objects.requireNonNull(user.id).toString(), user.username);
  }

}
