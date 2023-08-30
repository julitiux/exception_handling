package com.exception_handling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  UserRepository userRepository;

  @Override
  public User addUser(User user) {
    if(userRepository.findByUsername(user.username).isPresent())
      throw DuplicateEntity.product(user.username);
    return userRepository.save(user);
  }
}
