package com.example.demo.entity;


import javax.persistence.*;

@Entity
@Table(name = "demo_application")
public class DemoApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private ResolutionStatus status;

    public ResolutionStatus getStatus() {
        return status;
    }

    public void setStatus(ResolutionStatus status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DemoApplication(String name, ResolutionStatus status) {
        this.name = name;
        this.status = status;
    }

    public DemoApplication(String name) {
        this.name = name;
    }
    public DemoApplication() {

    }


}
