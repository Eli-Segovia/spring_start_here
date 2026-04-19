package com.segovia.tutorials.spring_start_here_ch3_wiring_beans.beans;

public class Person {

    private String name;
    private Parrot parrot;

    public Person(String name, Parrot parrot) {
        this.name = name;
        this.parrot = parrot;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }
}
