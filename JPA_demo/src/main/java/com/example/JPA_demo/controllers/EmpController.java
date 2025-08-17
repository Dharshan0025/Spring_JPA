package com.example.JPA_demo.controllers;

import com.example.JPA_demo.models.Employee;
import com.example.JPA_demo.services.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    EmpService service;

    @PostMapping
    public String addemp(@RequestBody Employee emp ){
        return service.addEmployee(emp);
    }
    @GetMapping("/id/{id}")
    public  Employee getemp(@PathVariable int id){
        return service.getEmployeeById(id);
    }
    @GetMapping
    public List<Employee> getAll(){
        return service.getAllEmployees();
    }
    @PutMapping
    public String update(@RequestBody Employee emp){
        return service.updateEmployee(emp);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        return service.deleteEmployee(id);
    }
    @DeleteMapping
    public String clearAll(){
        return service.deleteEmployeeAll();
    }

    @GetMapping("/dep/{dep}")
    public List<Employee> getByDep(@PathVariable String dep){
        return service.getEmployeeByDep(dep);
    }

}
