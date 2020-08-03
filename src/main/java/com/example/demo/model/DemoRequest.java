package com.example.demo.model;

import java.io.Serializable;

public class DemoRequest implements Serializable {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public DemoRequest(String name) {
        this.name = name;
    }

    public DemoRequest() {
    }

    @Override
    public String toString() {
        return "DemoRequest{" +
                "name='" + name + '\'' +
                '}';
    }
}
