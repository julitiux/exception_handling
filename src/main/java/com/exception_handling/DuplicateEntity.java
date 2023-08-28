package com.exception_handling;

import lombok.Getter;

@Getter
public class DuplicateEntity extends RuntimeException {

  private final String entityName;
  private final String entityId;
  private static final long serialVersionUID = 1L;

  public DuplicateEntity(String entityName, String entityId) {
    super("Duplicated %s with id %s ".formatted(entityName, entityId));
    this.entityName = entityName;
    this.entityId = entityId;
  }

  public static DuplicateEntity product(final String entityId) {
    return new DuplicateEntity("Product", entityId);
  }
  
}
