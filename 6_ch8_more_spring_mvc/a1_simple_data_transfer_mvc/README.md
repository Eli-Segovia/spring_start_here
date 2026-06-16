# Sending Data Back

In this example, we are sending back a simple web page back. Instead of being a static html file, it will be dynamic

In java land, working with dynamic html pages refers to "templated pages". And in order to send back dynamic "template"
pages, we need to have template engine. In this project we use something called "Thymeleaf".

I throw all the "controllers" into the controller package. I throw all templates in the src/resources/templates as opposed
to the "static" folder.

### Model Page
We can add dynamic content to our HTML using templates. here is a snippet of that in our controller using
the `Model` interface which adds the metadata to the html template:

```java
package com.segovia.tutorials.springboot.a1_simple_data_transfer_mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/home")
    public String home(Model page) { // gives us access to the page metadata
        page.addAttribute("username", "Katy"); // Adds metadata to the template html that we can use to dynamically display data
        page.addAttribute("color", "red");

        return "home.html";
    }
}
```

Then in the html we can use the metadata that was passed into it:

```java
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Home Page</title>
</head>
<body>

    <h1>Welcome <span th:style="'color:' + ${color}" th:text="${username}" ></span></h1>
</body>
</html>
```