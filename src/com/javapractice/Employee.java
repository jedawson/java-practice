package com.javapractice;

public class Employee {
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

    Long id;
    String name;

    public Employee(){

    }
    public Employee(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
