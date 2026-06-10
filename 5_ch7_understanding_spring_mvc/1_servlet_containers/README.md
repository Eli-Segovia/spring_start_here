# Using a servlet container in web app development

### What is a servlet container?
As you know the web works via HTTP/S. Java needs to send and receive HTTP/S. The conversion to and from HTTP/S to and from Java Code
is what a Servlet container takes care of. It's just a java-way of saying web server. A "servlet" itself is just a Java object that interacts with the
servlet container.

When the servlet container gets an HTTP request, it calls a servlet object's method and provides the request as a parameter. The same method also gets
a parameter representing the HTTP response used by the servlet to set the response sent back to the client.

One of the most used servlet containers is Tomcat.




