Require.java
============

- Checks method arguments with a fluent interface
- designed with alternative checks instead of IAE (e.g. NPE, assert, log) in mind
- public domain

```java
import static de.aboutco.req.Require;

public class Foo {
  public void bar(String a, Object b, Boolean c) {
    // throws IAE if any argument is null, shortcut for req().notNull(a, b, c)
    req(a, b, c);
    // throws IAE if any argument is null and provides custom exception msgs
    req(a, "A must not be null").notNull(b, "B must not be null").notNull(c, "C" must not be null);
    // throws IAE if string A is null or empty, if B is null or if c is false, custom msgs are optinal
    req().notNullOrEmpty(a, "A must not be empty).notNull(b, "B must not be null").tru(c);
  }
}
```

(@atamanroman)
