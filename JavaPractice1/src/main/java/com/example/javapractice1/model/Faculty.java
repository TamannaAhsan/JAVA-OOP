package com.example.javapractice1.model;

import lombok.Data;
import java.time.LocalDate;
@Data
public class Faculty extends Employee{
    private Integer course_assigned;
    public Faculty(Integer employee_id, String employee_name, LocalDate join_date, Gender gender, Double salary, Integer course_assigned) {
        super(employee_id, employee_name, join_date, gender, salary);
        this.course_assigned = course_assigned;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "employee_id=" + employee_id +
                ", employee_name='" + employee_name + '\'' +
                ", join_date=" + join_date +
                ", gender=" + gender +
                ", salary=" + salary +
                "course_assigned=" + course_assigned +
                '}';
    }
}
