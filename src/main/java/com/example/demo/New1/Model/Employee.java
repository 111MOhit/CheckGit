package com.example.demo.New1.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

   
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer EmID;
    private String Em_Name;
    private Integer Em_age;
    private Double Em_salary;
    
    public Employee(Integer emID, String em_Name, Integer em_age, Double em_salary) {
        this.EmID = emID;
        this.Em_Name = em_Name;
        this.Em_age = em_age;
        this.Em_salary = em_salary;
    }
    
   
    // Getters and Setters

    public Integer getEmID() {
        return EmID;
    }

    public void setEmID(Integer EmID) {
        this.EmID = EmID;
    }

    public String getEm_Name() {
        return Em_Name;
    }

    public void setEm_Name(String Em_Name) {
        this.Em_Name = Em_Name;
    }

    public Integer getEm_age() {
        return Em_age;
    }

    public void setEm_age(Integer Em_age) {
        this.Em_age = Em_age;
    }

    public Double getEm_salary() {
        return Em_salary;
    }

    public void setEm_salary(Double Em_salary) {
        this.Em_salary = Em_salary;
    }
}