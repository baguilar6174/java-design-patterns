package structural.proxy.pattern;

/**
 * ----------
 * Step 1
 * ----------
 * Represents a user with a name and a role.
 * The role determines the level of access a user has.
 */
public record User(String name, String role) {}
