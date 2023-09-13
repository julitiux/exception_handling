package com.exception_handling.webApi;

public record AddUserCommand(
  String username,
  String password) {
}
