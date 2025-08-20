package com.example.JPA_demo.repository;

import com.example.JPA_demo.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpRepo extends JpaRepository<Employee,Integer> {
     List<Employee> findByDepartment(String dep);
     @Query(nativeQuery = true,value="SELECT * FROM employee WHERE salary BETWEEN :start AND :end")
     List<Employee> findBySalaryRange(@Param("start") int start,@Param("end")int end);

     @Query(nativeQuery = true,value="Select * from employee where name like :ch%")
     List<Employee> findNameByChar(@Param("ch")char ch);
}
