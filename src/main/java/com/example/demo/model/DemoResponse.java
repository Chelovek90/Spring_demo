package com.example.demo.model;

import java.io.Serializable;

public class DemoResponse implements Serializable {

    private DemoRequest request;
    private Long id;
    private String resolution;

    public DemoRequest getRequest() {
        return request;
    }

    public void setRequest(DemoRequest request) {
        this.request = request;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "DemoResponse{" +
                "request=" + request +
                ", id=" + id +
                ", resolution='" + resolution + '\'' +
                '}';
    }
}
