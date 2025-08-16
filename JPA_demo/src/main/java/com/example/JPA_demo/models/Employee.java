package com.example.JPA_demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Employee {
    @Id
    private int id;
    private String name;
    private String department;
    private double salary;

}

