package com.javapractice;

public class Supervisor extends Employee{

    public int getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    int yearsExperience;

    public Supervisor(){
        super();

    }
}
