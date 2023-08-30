package com.exception_handling;

public record AddUserCommand(
  String username,
  String password) {
}
