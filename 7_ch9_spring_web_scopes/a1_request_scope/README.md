# Request-Scoped Beans

## What is it

Put simply a request scope bean creates an instance of a bean class for EVERY request. That means that
the bean only exists for that specific request. Any future request will get a different bean.


## How we show this in this project
In this example, we will simulate "logging in". We will create a form that takes login credentials.

Logging in is just an example. We would only want to keep the login credentials in memory for however long
the request transaction exists. Keeping it as a singleton would be bad because singleton keeps it in memory longer than
the request lives. Same thing for Prototype.

Note: You can just use Spring Security for good login practices. We just create our own fake login logic
to demo request-scoped beans.


### Order I would recommend to look at this
1. Look at resources/templates/login.html - this contains our login form. It takes a message from the LoginController
2. LoginController loginGet -> simply returns the login.html without affecting the message variable
3. LoginController loginPost -> takes the form data and html model template page does logic and returns the template
4. LoginProcessor -> validates the password. It is what we set to request-scope. This class takes the creds
from the request and validates the request.