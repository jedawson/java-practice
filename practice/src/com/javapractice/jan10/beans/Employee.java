package com.javapractice.jan10.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int hashCode(){
        int hash = 13;
        hash = (hash * 7) + id ;
        hash = (hash * 7) + ((firstName == null) ? 0 : firstName.hashCode());
        hash = (hash * 7) + ((lastName == null) ? 0 : lastName.hashCode());
        hash = (hash * 7) + ((email == null) ? 0 : email.hashCode());
        return hash;
    }
    public boolean equals(Object object) {
        if(object == null) {
            return false;
        }
        if(this.getClass() != object.getClass()) {
            return false;
        }
        if(object instanceof Employee && this == object) {
            return true;
        }
        Employee employee = (Employee) object;
        return this.id == employee.getId()
                && this.firstName.equals(employee.getFirstName())
                && this.lastName.equals(employee.getLastName())
                && this.email.equals(employee.getEmail());
    }
}
