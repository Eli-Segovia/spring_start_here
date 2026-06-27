package com.segovia.tutorials.rest_apis.a1_rest_controller.controllers;

import com.segovia.tutorials.rest_apis.a1_rest_controller.beans.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/simple-country-endpoint")
    public Country hello() {
        Country country = Country.of("El Salvador", 200000, "San Salvador");
        return country;
    }

    @GetMapping("/response-entity-endpoint")
    public ResponseEntity<Country> countryResponseEntity() {
        Country country = Country.of("El Salvador", 200000, "San Salvador");
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("continent", "EUROPE")
                .header("capital", "San Salvador")
                .body(country);
    }
}
