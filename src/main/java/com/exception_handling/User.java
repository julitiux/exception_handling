package com.exception_handling;

import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "people")
@Getter
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  UUID id;

  String username;

  String password;

  @CreationTimestamp
  Date dateCreated;

  public User(UUID id, String username, String password, Date dateCreated) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.dateCreated = dateCreated;
  }

}
