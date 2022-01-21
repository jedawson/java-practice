package org.example.service;

import org.example.beans.Employee;
import org.example.repo.EmployeeRepo;

public class EmployeeService {
    EmployeeRepo employeeRepo;

    public EmployeeRepo getEmployeeRepo() {
        return employeeRepo;
    }

    public void setEmployeeRepo(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee save(Employee employee) {
        return employeeRepo.save(employee);
    }
    public Employee find(Integer id) {
        employeeRepo.findById(id).get();
    }

    public List<Employee> findAll() {
        return (List<Employee>) employeeRepo.findAll();
    }

    public void delete(Integer id) {
        employeeRepo.deleteById(id);
    }
}
