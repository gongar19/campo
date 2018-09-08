package com.company;

import java.util.ArrayList;

public class ResidenceType {
    private Integer id;
    private String name;
    private Integer maxStay;

    public ResidenceType(Integer id, String name, Integer maxStay) {
        this.name = name;
        this.maxStay = maxStay;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getMaxStay() {
        return maxStay;
    }
}
