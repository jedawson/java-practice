package com.javapractice.jan10.beans;

import java.util.Comparator;

public class EmployeeFirstNameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee employee, Employee other) {
        return employee.firstName.compareTo(other.firstName);
    }
}
