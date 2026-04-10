# Difference between defining Beans using Annotations vs Defining in Project Configuration

| __Using the @Bean Annotation in Project Config__                                                                                 | __Using Stereotype Annotations__                                                                 |
|----------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------|
| 1. Pro: You have full control over the instance creation. You define the bean<br/>exactly as you want it.                        | 1. Con: You only have control of the bean after spring creates it.                               |
| 2. Pro: You can add multiple methods that add beans of the same type.                                                            | 2. Con: You can only add one bean of the same type                                               |
| 3. Pro: You can add Beans from classes that are not in your application. E.g<br/>we added the Integer class as a bean. in step2. | 3. Con: You can only use Stereotype annotations for classes that you control in the source code. |
| 4. Con: Adds a lot of boilerplate code. Prefer Annotations for a cleaner src<br/>code.                                           | 4. Pro: less boilerplate. Preferred approach over @Bean, but we will use them in conjunction.    |
