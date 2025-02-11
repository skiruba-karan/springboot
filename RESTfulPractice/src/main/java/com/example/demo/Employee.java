package com.example.demo;

/**
 * Employee Model Class
 */
public class Employee {
    private final long id;
    private final String name;
    private final String role;

    public Employee(long id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
}
