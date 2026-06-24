# Session scope

## What is it
When you log into a website, you expect to stay logged into the website even if you click across different pages. A session
scopes bean is a bean where Spring creates an instance and links it to the HTTP session.

The client sends a request to the server, the server reserves a place in memory for the bean. And that bean lasts the whole session

Think shopping cart.

## What we do in this project:
1. create a session-scoped bean to keep the logged-in user's details
2. create a page a user can only access after login
3. user cannot access the page without loggin in
4. redirect the user from login to the main page after successful authentication.

## Order I would check through this:
1. a lot of the code is from the previous example look at previous example to catch up on that
2. LoggedUserManagementService -> keeps track of logged in username we can check against this to go to the main page
which is only accessible to logged in users
3. We then check in MainPageController whether the user is logged in. If he is, we let them into main, else we don't
4. I added a lame logout functionality that sets the username to null if you go back to login screen and sign in with
wrong creds.