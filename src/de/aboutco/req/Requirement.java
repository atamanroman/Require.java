package de.aboutco.req;

/**
 * Interface for validation of preconditions/assertions. Does something when a condition is not met
 * (IAE, log, ...).
 * 
 * @author atamanroman
 *
 */
public interface Requirement {
    
  static final String OBJECT_NOT_NULL = "Argument must not be null";
  static final String BOOLEAN_TRUE = "Argument must be true. Null or false is not allowed.";
  static final String STRING_NOT_NULL_EMPTY = "Argument must not be null or empty";
  
  /**
   * 
   * @param one
   * @return this for method chaining
   */
  Requirement notNull(Object one);

  /**
   * 
   * @param one
   * @param message
   * @return this for method chaining
   */
  Requirement notNull(Object one, String message);

  /**
   * 
   * @param objects
   * @return this for method chaining
   */
  Requirement notNull(Object... objects);

  /**
   * 
   * @param one
   * @return this for method chaining
   */
  Requirement notNullOrEmpty(String one);

  /**
   * 
   * @param one
   * @param message
   * @return this for method chaining
   */
  Requirement notNullOrEmpty(String one, String message);

  /* Not part of the interface because it may cause funny problems with 
   * notNullOrEmpty(String one, String message), sorry!
   */
  // Requirement notNullOrEmpty(String... strings);

  /**
   * 
   * @param one
   * @return this for method chaining
   */
  Requirement tru(boolean one);

  /**
   * 
   * @param one
   * @param message
   * @return this for method chaining
   */
  Requirement tru(boolean one, String message);
      
  /**
   * 
   * @param booleans
   * @return this for method chaining
   */
  Requirement tru(Boolean... booleans);
}
