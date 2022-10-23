package com.example.javapractice1.model;

import lombok.Data;
import java.time.LocalDate;
@Data

public class Advisor extends Employee{
    private Integer student_assigned;
    public Advisor(Integer employee_id, String employee_name, LocalDate join_date, Gender gender, Double salary, Integer student_assigned) {
        super(employee_id, employee_name, join_date, gender, salary);
        this.student_assigned = student_assigned;
    }

    @Override
    public String toString() {
        return "Advisor{" +
                "employee_id=" + employee_id +
                ", employee_name='" + employee_name + '\'' +
                ", join_date=" + join_date +
                ", gender=" + gender +
                ", salary=" + salary +
                "student_assigned=" + student_assigned +
                '}';
    }
}
