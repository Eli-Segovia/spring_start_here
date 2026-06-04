# Extracting info from intercepted methods

I am going to type these into notes because my stupid intellij just doesn't want to compile. I spent over an hour trying
to debug it, but it has not been worth the effort.

Here is an example of extracting some information from an intercept method using the bullshit aspect syntax we saw in
example 2. You can manipulate return type and even arguments.

```java

// here is the og class with its service method we intercept:
@Service
public class CommentService{
    private Logger //wtv logger shit.
    
    public String publishComment(Comment comment) {
        logger.info("logging shit.");
        return "SUCC";
    }
}


@Aspect
public class LoggingAspect {
    private Logger logger = Logger.getLogger(classNameWtv);
    
    // remember that ProceedingJointPoint = the abstraction that our Aspect makes to represent our intercepted method.
    @Arouond("execution(* services.*.*(..))") // more bullshit
    public Object log (ProceedingJointPoint jointPoint) throws Throwable {
        String methodName = jointPoint.getSignature().getName(); // we can get the Method name!!!
        Object [] arguments = jointPoint.getArgs(); // we can get the arguments
        
        logger.info("do logging shit with our extracted data");
        
        Object returnType = jointPoint.proceed(); // we can capture the returned object
        
        return returnType;
    }
}
```

## Understanding this power

So we can grab the arguments, return type, method name, and probably other shit that
the book didn't get into.

With just the arugment, return type, and method name, though... We can do some powerful shit:

* change the value of the arguments we send to the real method
* change the returned value received by the caller
* You can even change the method behavior completely!