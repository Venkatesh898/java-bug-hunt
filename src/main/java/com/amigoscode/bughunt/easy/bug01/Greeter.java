package com.amigoscode.bughunt.easy.bug01;

public class Greeter {

    public String greet(String name) {
        String safe = name == null ? "guest" : name;
        return "Hello, " + safe.toUpperCase() + "!";
    }
}
