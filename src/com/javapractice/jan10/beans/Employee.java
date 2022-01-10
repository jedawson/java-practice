package com.javapractice.jan10.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Comparable<Employee> {
    int id;
    String firstName;
    String lastName;
    String email;
    public String toCSV(){
        return id+", "+firstName+", "+lastName+", "+email;
    }
    public static Employee parseEmployee(String csvEmployee) {
        String[] values = csvEmployee.split(",");
        int id = Integer.parseInt(values[0].trim());
        String firstName = values[1].trim();
        String lastName = values[2].trim();
        String email = values[3].trim();
        Employee employee = new Employee(id, firstName, lastName, email);
        return employee;
    }

    @Override
    public int compareTo(Employee other){
        return this.id - other.id;
    }
}
