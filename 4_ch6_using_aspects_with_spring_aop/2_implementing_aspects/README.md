# Implementing a simple Aspect

In this example, we have a `CommentService` which is used to publish `Comment`(s). This service does
so by way of the `publishComment` method it has. You can think of this service as a full-on service that actually
does it.

Here's the order you should look at these classes if you want to understand what is going on:

1. `ProjectConfig`
2. `LoggingAspect`
3. `CommentService`


### `ProjectConfig`
in ProjectConfig you will see the annotation `@EnableAspectJAutoProxy`. This is to tell spring to Enable Aspect Proxying.
We also add the LoggingAspect as a bean to the context.

### `LoggingAspect`
In LoggingAspect, we define the Aspect itself with the `@Aspect` annotation. We then define the logic that we want to
execute for a specific time.

The logic we want to execute (it's called the advice), will take the `@Around` annotation,
which tells spring which method calls it needs to intercept to execute the aspect.

The `@Around` annotation takes in a weird string that is called "AspectJ pointcut expression". Apparently we really need
a whole new type of expression for this bullshit. This expression defines what methods we want to intercept. I just copied
the expression, but you can go to http://mgn.bz/4K9g to read up on this pointcut expression. I will just look up expressions
as I go, because I don't really care to read up on "AspectJ pointcut expressions". This is news to me. But basically,
we tell spring which method to intercept with this new bullshit expression

The `JointPoint` parameter represents the intercepted method. The `proceed` method tells Spring to continue with the
regular execution of the intercepted method. If we never call ther `proceed` method, then we never execute the 
intercepted method. You better call it.
