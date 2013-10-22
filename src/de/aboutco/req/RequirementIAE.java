package de.aboutco.req;

/**
 * Throws IAE if conditions are not met
 * @author atamanroman
 *
 */
class RequirementIAE implements Requirement {

  private static void t(String msg) {
    throw new IllegalArgumentException(msg);
  }

  @Override
  public Requirement notNull(Object... objects) {
    if (objects == null) {
      t(OBJECT_NOT_NULL);
    }
    
    for (Object object : objects) {
      if (object == null) {
        t(OBJECT_NOT_NULL);
      }
    }

    return this;
  }

  @Override
  public Requirement notNull(Object one) {
    if (one == null) {
      t(OBJECT_NOT_NULL);
    }
    
    return this;
  } 
  
  @Override
  public Requirement notNull(Object one, String message) {
      if(one == null) {
          t(message);
      }
      
      return this;
  }

  @Override
  public Requirement notNullOrEmpty(String one) {
    if (one == null || one.isEmpty()) {
      t(STRING_NOT_NULL_EMPTY);
    }

    return this;
  }

  @Override
  public Requirement notNullOrEmpty(String one, String message) {
    if (one == null || one.isEmpty()) {
      t(message);
    }

    return this;
  }

  @Override
  public Requirement tru(boolean one) {
    if (!one) {
      t(BOOLEAN_TRUE);
    }

    return this;
  }

  @Override
  public Requirement tru(boolean one, String message) {
    if (!one) {
      t(message);
    }

    return this;
  }

  @Override
  public Requirement tru(Boolean... booleans) {
    if (booleans == null) {
      t(BOOLEAN_TRUE);
    }
    
    for (Boolean bool : booleans) {
      if (bool == null || !bool) {
        t(BOOLEAN_TRUE);
      }
    }
    
    return this;
  }
}
