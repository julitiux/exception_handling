package com.exception_handling;

public class UserWebApiMapper {

  public static User of(final AddUserCommand addUserCommand){
    return new User(null, addUserCommand.username(), addUserCommand.password(), null);
  }

}
