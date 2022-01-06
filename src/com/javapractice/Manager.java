package com.javapractice;

public class Manager extends Employee {

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    String qualifications;

    public Manager() {
        super();
    }
}
