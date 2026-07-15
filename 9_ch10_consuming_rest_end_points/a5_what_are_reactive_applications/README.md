# What the Hell are Reactive Apps?

## Regular Apps
In "Regular Apps" you have blocking threads (or workers or flows). Say you have a banking app that goes through this flow:
1. Receive a bank customer ID from the DB
2. Use the ID to find credit balance from other banks and make calculations
3. use the ID to find credit balance internally and make calculation
4. Use the ID to find bank account balance and other institutions
5. use the ID to find bank account balance internally
6. take sum of 4 and 5
7. Take SUM of 2 and 3
8. Take Difference of 6 and 7
9. Return to user

If the flow gets stuck on say #2, then any other requests making requests have to wait on the thread to finish the whole flow.
If the application were smart (cough cough -- reactive) the threads would behave more intelligently and go make calls non-blocking
(asynchronous) such that it would execute all tasks that could be done, and then move onto other requests and work on them when possible.



So you got the gist....


# WebClient

WebClient is used for Reactive Apps. If not working on Reactive Apps, open feign is the recommended approach :)