package com.segovia.tutorials.springboot.a3_full_service_example.controllers;

import com.segovia.tutorials.springboot.a3_full_service_example.models.Product;
import com.segovia.tutorials.springboot.a3_full_service_example.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductsController {

    private final ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    // get products to send to View
    @RequestMapping("/products")
    public String viewProducts(Model model) {
        var products = productService.findAll();
        model.addAttribute("products", products); // add the products as a list to model metadata
        return "products.html";
    }

    // Add Products using our service to the list in ProductService, and then return the view...
    @RequestMapping(path = "/products", method = RequestMethod.POST)
    public String addProduct (@RequestParam String name, @RequestParam double price, Model model) {
        Product p = new Product();
        p.setName(name);
        p.setPrice(price);

        productService.addProdcut(p);

        var products = productService.findAll();
        model.addAttribute("products", products);

        return "products.html";
    }
}
