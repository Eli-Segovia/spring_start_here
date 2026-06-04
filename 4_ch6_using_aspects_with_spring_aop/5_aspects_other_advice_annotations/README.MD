# Other Advice Annotations

Honestly, @Around is the more powerful of them all. Whatever you can do in the others, you can do with around. Around
just gives you the most control. But here are the other Advice annotations you can use:

* @Before - calls the aspect logic before the execution of the intercepted method
* @AfterReturning - calls the aspect logic after the method successfully returns
* @AfterThrowing - calls the aspect logic after the method throws an exception
* @After - calls the method after either a successful return or an exeception was thrown

However, you do not receive the ProceedingJointPoint parameter. Just use @Around