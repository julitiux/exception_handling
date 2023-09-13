package com.exception_handling.service.impl;

import com.exception_handling.DuplicateEntity;
import com.exception_handling.domain.User;
import com.exception_handling.repository.UserRepository;
import com.exception_handling.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  UserRepository userRepository;

  @Override
  public User addUser(User user) {
    if (userRepository.findByUsername(user.getUsername()).isPresent())
      throw DuplicateEntity.user(user.getUsername());
    return userRepository.save(user);
  }
}
