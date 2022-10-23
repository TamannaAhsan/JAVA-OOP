package com.example.javapractice1.model;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee implements Serializable {
    public Integer employee_id;
    public String employee_name;
    public LocalDate join_date;
    public Gender gender;
    public Double salary;
    @Override
    public String toString() {
        return "Employee{" +
                "employee_id=" + employee_id +
                ", employee_name='" + employee_name + '\'' +
                ", join_date=" + join_date +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }
}
