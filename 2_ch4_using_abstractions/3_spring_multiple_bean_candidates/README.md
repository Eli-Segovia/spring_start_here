## Concept: Interfaces

Loose coupling = less code changes.

We don't want to have to make a lot of code changes if some implementation detail changes. We should write code
that doesn't care about implementation details, only _what_ we need/want to do in the code.

Interfaces define a contract : the what we need/want. If we code to interfaces, we are defining the need/want,
and allow for implementation details to be whatever the heck we need them to be without all the code change.

## What we are implementing:
![img.png](img.png)

## Using @Primary for multiple implementation/candidates case'

I long wondered why we even use the `@primary` annotation, when the `@qulifier` annotation seemed more useful. Well,
the reason is sometimes we bring in different APIs -- for example let's say we brought in some API that brings in som'
JMS implementation, but we want to use our own JMS implementation. spring might get confused by our and the API's'
implementation, but we want to strictly use our own implementation. @Primary is good.