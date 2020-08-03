package com.example.demo.model;

import com.example.demo.entity.DemoApplication;

import java.io.Serializable;
import java.util.List;

public class DemoList implements Serializable {

    List<DemoApplication> values;

    public DemoList(List<DemoApplication> values) {
        this.values = values;
    }

    public DemoList() {
    }

    public List<DemoApplication> getValues() {
        return values;
    }

    public void setValues(List<DemoApplication> values) {
        this.values = values;
    }
}
