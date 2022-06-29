package com.example.springjpa.repository;

import com.example.springjpa.entity.Guardian;
import com.example.springjpa.entity.Student;
import lombok.Builder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLOutput;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest

//@DataJpaTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;
    @Test
    public void saveStudent(){
        Student student = Student.builder()
                .email("tam@gmail.com")
                .firstName("Tamanna")
                //.guardiaMobile("0123456")
                //.guardianEmail("ahsanAli@gmail.com")
                //.guardianName("Ahsan Ali")
                .lastName("Ahsan")
                .build();
        studentRepository.save(student);
    }
    @Test
    public <Gaurdian> void saveStudentWithGuardian(){

        Gaurdian guardian = (Gaurdian) Guardian.builder()
                .name("Malia Ali")
                .email("malia@gmail.com")
                .mobile("0987765")
                .build();

        Student student = Student.builder()
                .firstName("Tahir")
                .email("tahir@gmail.com")
                .lastName("Ahmed")
                .guardian((Guardian) guardian)
                .build();
        studentRepository.save(student);
    }

    @Test
    public void printAllStudents(){
        List<Student> studentList = studentRepository.findAll();
        System.out.println("Student List: "+studentList);
    }

    @Test
    public void printStudentsByFirstName(){
        List<Student> students = studentRepository.findByFirstName("Tahir");
        System.out.println("List By FirstName: "+students);
    }

    @Test
    public void printStudentsByFirstNameContaining(){
        List<Student> students = studentRepository.findByFirstNameContaining("Ta");
        System.out.println("List By FirstName: "+students);
    }

    @Test
    public void printStudentsByLastNameNotNull(){
        List<Student> students = studentRepository.findByLastNameNotNull();
        System.out.println("List By FirstName: "+students);
    }

    @Test
    public void printStudentsBasedOnGuardian(){
        List<Student> students = studentRepository.findByGuardianName("Ahsan");
        System.out.println("List By FirstName: "+students);
    }

}