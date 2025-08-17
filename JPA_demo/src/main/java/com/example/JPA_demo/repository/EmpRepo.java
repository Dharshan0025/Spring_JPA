package com.example.JPA_demo.repository;

import com.example.JPA_demo.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpRepo extends JpaRepository<Employee,Integer> {
     List<Employee> findByDepartment(String dep);
}
