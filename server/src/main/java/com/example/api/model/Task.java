package com.example.api.model;

public class Task {
    public String id;
    public String name;
    public String description;

    public Task(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}