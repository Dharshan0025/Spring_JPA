package com.example.JPA_demo.services;

import com.example.JPA_demo.models.Employee;
import com.example.JPA_demo.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpService {

    @Autowired
    EmpRepo empRepo;

    public String addEmployee(Employee emp) {
        empRepo.save(emp);
        return "Employee details added successfully";
    }

    public Employee getEmployeeById(int id) {
        return empRepo.findById(id).orElse(new Employee());
    }

    public List<Employee> getAllEmployees() {
        return empRepo.findAll();
    }

    public String updateEmployee(Employee emp) {
        empRepo.save(emp);
        return "data updated sucessfully";
    }

    public String deleteEmployee(int id) {
        empRepo.deleteById(id);
        return "data deleted sucessfully";
    }

    public String deleteEmployeeAll() {
        empRepo.deleteAll();
        return "All data cleared successfully";
    }

    public List<Employee> getEmployeeByDep(String dep) {
        return empRepo.findByDepartment(dep);
    }
}
