package org.example.service;

import org.example.beans.Employee;

public class DbSaverService {
    String driver;
    String url;
    String username;
    String password;

    public void save(Employee employee) {
        System.out.println("Saving employee into DB");
        System.out.println("driver: " + driver);
        System.out.println("URL: "+ url);
        System.out.println("Username: " + username + " and password: " + password);
        System.out.println("Saved Employee: " + employee);
    }
}
