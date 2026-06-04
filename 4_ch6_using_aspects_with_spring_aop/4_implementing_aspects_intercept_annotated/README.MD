# Using annotations instead of using the weird ass regex thing

You can also use custom annotations to apply the aspects you want to do Here is how you do that:

## Creating the custom annotation:
```java
@Retention(RetentionPolicy.RUNTIME) // done because annotatins are not interpreted at runtime by default. need to tell it
@Target(ElementType.METHOD) // done because by default annotations can target anything restrictive = more secure
public @interface ToLog{
    
}
```

and that's it! Now we tell our aspect to find any method with this annotation:

```java
@Aspect
public class LoggingAspect {
    
    @Around("@annotation(ToLog)")
    public Object log(ProceedingJointPoint jointPoint) {
        // logic
    }
}
```

And Finally, we apply the annotation:

```java
@Service
public class SomeStupidService{
    public void method1() {
        
    }
    
    public void method2() {
        
    }
    @ToLog
    public void methodWeWantToLog(){
        
    }
}
```

And our method will log stuff that we define in the aspect code!