# Open Feign

Open Feign is apparentley _the best_ way to interact with a REST endpoint
in Spring Land.

You only need to define an interface where you declare the methods that conusme the REST endpoint. You just annotate
these with some information like path, method, parameters, headers, and body. Then SPRING just makes it work. pretty dope.


You can look at the `PaymentsProxy` interface that defines this...

