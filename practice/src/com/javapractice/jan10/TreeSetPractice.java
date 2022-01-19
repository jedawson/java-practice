package com.javapractice.jan10;

import com.javapractice.jan10.beans.Employee;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetPractice {

    public static void main(String[] args) {
        TreeSet<Employee> employeeTreeSet = new TreeSet<>();
        employeeTreeSet.add(new Employee(101, "John", "M", "example@example.com"));
        employeeTreeSet.add(new Employee(103, "Ed", "M", "example@example.com"));
        employeeTreeSet.add(new Employee(106, "Bob", "M", "example@example.com"));
        employeeTreeSet.add(new Employee(109, "Chris", "M", "example@example.com"));
        //crisp doesn't get added
        employeeTreeSet.add(new Employee(109, "Crisp", "M", "example@example.com"));
        employeeTreeSet.add(Employee.parseEmployee("303, Jake, E, example@example.com"));
        for (Employee employee : employeeTreeSet) {
            System.out.println(employee.toCSV());
        }
    }
}
