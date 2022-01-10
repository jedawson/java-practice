package com.javapractice.jan10;

import com.javapractice.jan10.beans.Employee;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "John", "M", "example@example.com"));
        employees.add(new Employee(103, "Ed", "M", "example@example.com"));
        employees.add(new Employee(106, "Bob", "M", "example@example.com"));
        employees.add(new Employee(109, "Chris", "M", "example@example.com"));
        employees.add(Employee.parseEmployee("303, Jake, E, example@example.com"));
        for (Employee employee : employees) {
            System.out.println(employee.toCSV());
        }
    }
}
