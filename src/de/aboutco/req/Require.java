package de.aboutco.req;

/**
 * Factory for Requirement
 *
 * @author atamanroman
 *
 */
public class Require {
    private static Requirement current = new RequirementIAE();

    /**
     * @return instance of Requirement to do your argument checking
     * @see Requirement
     */
    public static Requirement req() {
        return current;
    }

    /**
     * @param o
     * @param message
     * @return instance of Requirement to do your argument checking
     */
    public static Requirement req(Object o, String message) {
        return current.notNull(o, message);
    }

    /**
     * @param objects
     * @return instance of Requirement to do your argument checking
     * @throws IllegalArgumentException
     *             if any of the passed objects is null
     */
    public static Requirement req(Object... objects) {
        return current.notNull(objects);
    }

    /**
     * 
     * @param s
     * @param message
     * @return instance of Requirement to do your argument checking
     */
    public static Requirement req(String s, String message) {
        return current.notNullOrEmpty(s, message);
    }

    /**
     * @param b
     * @param message
     * @return instance of Requirement to do your argument checking
     */
    public static Requirement req(boolean b, String message) {
        return current.tru(b, message);
    }
    
    /**
     * @param bools
     * @return instance of Requirement to do your argument checking
     */
    public static Requirement req(Boolean... bools) {
        return current.tru(bools);
    }

    /**
     * no no
     */
    private Require() {
    }
}
