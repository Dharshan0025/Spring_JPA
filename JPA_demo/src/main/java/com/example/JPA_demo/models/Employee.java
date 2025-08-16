package com.example.JPA_demo.models;

import jakarta.persistence.Entity;

@Entity
public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

}

