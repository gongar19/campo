package com.company;

import java.util.ArrayList;

public class Requirement{
    private Integer id;
    private String name;
    private String descr;

    public Requirement(Integer id, String name, String descr) {
        this.name = name;
        this.descr = descr;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public Integer getId() {
        return id;
    }
}
