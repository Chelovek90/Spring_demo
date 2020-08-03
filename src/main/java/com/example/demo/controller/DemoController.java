package com.example.demo.controller;

import com.example.demo.model.DemoList;
import com.example.demo.model.DemoRequest;
import com.example.demo.model.DemoResponse;
import com.example.demo.services.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    private final DemoService service;

    public DemoController(DemoService service) {
        this.service = service;
    }

    @GetMapping("/demos")
    public DemoList getAll() {
        return service.getAll();
    }

    @GetMapping("/demos/successful")
    public DemoList getAllSuccessful() {
        return service.getAllSuccessful();
    }

    @PostMapping("/demo")
    public DemoResponse registerApplication(@RequestBody DemoRequest request) {
        return service.registerApplication(request);
    }
}
