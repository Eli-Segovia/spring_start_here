# Bean Scopes

Basically a Bean scope is what mechanism Spring uses to initialize beans. In chapter 5, we only discuss two:
* Singleton
* Prototype

By Default, spring uses Singletonl, and it is what we have worked with.

## Singleton

Basically Spring creates one bean per instance. This doesn't mean you can't have multiple instances of the same type.
For example, I can have EsegoviService1 and EsegoviService2, both of type EsegoviService.

You can either have an Eager or a Lazy Singleton bean. Eager means Spring initializes all beans from the beginning, while
lazy means Spring only initializes it if we call it. Usually we go for Lazy.

Note that there can be concurrency problems with singleton beans, because if one bean is created, and several threads
depend on that Bean, then there can be race conditions. More multithreading appraoches will need to be taken.


## Prototype

With prototype, we need to define the scope. Since Singleton is default, we need to specify how to define prototypel.
This is how you do it:

``` java
@Configuration
public class ProjectConfig {

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public EsegoviService esegoviService() {
        return new EsegoviService();
    }
}
```


When you call the bean, prototype gives you a different bean all the time.
```java
public class Main{
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    
    EsegoviService service1 = context.getBean("esegoviService", EsegoviService.class);
    EsegoviService service2 = context.getBean("esegoviService", EsegoviService.class);
    
    System.out.println(service1 == service2); // prints "false"
}
```

Prototype beans are very useful when you need to Spring to manage an object that needs to be mutable. If it has attributes
that constantly changed, you don't want the race condition problems that the Singleton Bean will run into.

## Compare and Contrast

| Singleton                                                                                             | Prototype                                                                                            |
|-------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------|
| The framework associates a name with an actual object instance                                        | A name is associated with a type                                                                     |
| Every time you refer to a bean name, you'll get the same instance                                     | Every time you refer to a bean name, you get a new instance                                          |
| You can configure Spring to create the instances when the context is loaded or when first referred to | The framework always creates the object instances for the prototype scope when you refer to the bean |
| Singleton is the default bean scope in spring                                                         | You need to explicitly mark the bean as a prototype                                                  |
| It's not recommended that singleton bean have mutable attributes                                      | A prototype bean can have mutable attributes.                                                        |


