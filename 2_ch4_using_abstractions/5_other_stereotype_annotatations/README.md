## Concept: Interfaces

Loose coupling = less code changes.

We don't want to have to make a lot of code changes if some implementation detail changes. We should write code
that doesn't care about implementation details, only _what_ we need/want to do in the code.

Interfaces define a contract : the what we need/want. If we code to interfaces, we are defining the need/want,
and allow for implementation details to be whatever the heck we need them to be without all the code change.

## What we are implementing:
![img.png](img.png)

# Other Stereotype Annotations
There are two other annotations that I am going to drop here that are technically very similar but serve different
purposes. They are just like @Component, in that Spring is adding them as beans into the app context, but they sort of
represent different types of beans
### Service
Marks a component that takes responsibility of a service
### Repository
marks a component that implements a repository responsibility.

### Here's how we would annotate oure fake Service's components

![img_1.png](img_1.png)