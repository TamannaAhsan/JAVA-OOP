package com.example.springjpa.repository;

import com.example.springjpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

@Component
public interface StudentRepository extends JpaRepository<Student,Long> {

    public List<Student> findByFirstName(String firstName);
    public List<Student> findByFirstNameContaining(String name);
    public List<Student> findByLastNameNotNull();
    public List<Student> findByGuardianName (String guardianName);

}
