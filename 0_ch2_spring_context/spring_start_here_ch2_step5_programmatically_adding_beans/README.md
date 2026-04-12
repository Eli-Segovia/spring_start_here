Here we are adding beans using straight up Java. This is probably the least preferred way to add Beans. However
It gives us the _most_ control of all the ways. For example if we need to add a specific bean to the context specifically
for some niche situation that needs an if/then.

We Take advantage of the applicationContext `registerBean` method.