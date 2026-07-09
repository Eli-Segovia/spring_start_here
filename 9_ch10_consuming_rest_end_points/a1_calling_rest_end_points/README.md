# Consuming REST Endpoints

As you already know, Eli, you have to know what you are going to send in your request in order to
know what you're getting back. The REST endpoint is expecting a specific format and specific
criteria, so you need to know how to do that.

A lot of times, you can speak to a REST application straight from the client code, using JS
on itself. We did that in the last example using a simple FORM, which kind of deals with sending
the data in its own way.


In this chapter, we are actually going to learn how to consume REST enpdpoints with SPRING.

Apparently, there are three ways we are going to do that:

* OpenFeign- A tool offered by Spring Cloud Project. The author recommends using this one for
future projects...
* RestTemplate - a well-known tool developers have used for a while. Often used. Author still
thinks we should try to use OpenFeign.
* WebClient - An approach called _Reactive Programming_ -- whatever the hell that means.


In order to demonstrate these, we are going to create a fake payment application again.