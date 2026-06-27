package com.segovia.tutorials.rest_apis.a1_rest_controller.beans;

public class Country {
    String name;
    private int population;
    String capital;

    public static Country of (String name, int population, String capital) {
        Country country = new Country();
        country.setName(name);
        country.setPopulation(population);
        country.setCapital(capital);
        return country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
