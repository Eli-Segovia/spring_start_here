# Execution Chain

Often we have more than one aspect acting on the same method. Determining the order of these can be very important.

For Example, we already saw that we can have a LoggingAspect. Let's say we want to add a SecurityAspect that does
some sore of security mechanism on the method.

When you have a lot of aspects weaved to the same method, they need to execute one after the other. So, we can either have:

`SecurityAspect -> LoggingAspect -> interceptedMethod`

or

`LoggingAspect -> SecurityAspect -> interceptedMethod`


The importance of the order is not inherant, but let's say for instance that `SecurityAspect` sometimes does NOT delegate
to the next aspect for some reason. It would be unwise to set that as the first aspect to go because our logging aspect
would no longer excecute.


By default, Spring does not guarantee the order in which two aspects in the same execution chain are called. If you do
need to define the aspects' execution order, you need to use the @Order annotation. It takes a number representing
the order in the execution chain for a specific aspect. the smaller the number is the earlier in the execution chain
it will go.

I won't do it in the code, but I provide an example in this markdown below:

```java
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

@Aspect
@Order(1)
public class SecurityAspect {
    // this will go before logging aspect now
}

@Aspect
@Order(2)
public class LoggingAspect {
    // this will go before logging aspect now
}
```