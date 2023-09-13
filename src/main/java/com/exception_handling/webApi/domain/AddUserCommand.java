package com.exception_handling.webApi.domain;

public record AddUserCommand(
  String username,
  String password) {
}
