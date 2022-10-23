package com.example.javapractice1;

import com.example.javapractice1.model.Advisor;
import com.example.javapractice1.model.Employee;
import com.example.javapractice1.model.Faculty;
import com.example.javapractice1.model.Gender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;


@SpringBootApplication
public class JavaPractice1Application {

    public static void main(String[] args) {

        SpringApplication.run(JavaPractice1Application.class, args);

        Employee employee1 = new Employee(1, "Atik", LocalDate.now(), Gender.MALE, 50.000);

        Employee employee2 = new Advisor(2, "Sabina", LocalDate.now(), Gender.FEMALE, 35.000, 30);

        Employee employee3 =new Faculty(3, "Mila", LocalDate.now(), Gender.FEMALE, 55.000, 6);

        List<Employee> employees = Arrays.asList(employee1, employee2, employee3);

        employees.stream()
                        .filter(employee -> employee.getGender().equals(Gender.FEMALE) && employee.getSalary()==55.000);
                      //.map(element-> element.getSalary()+100.000)
                        //.forEach(System.out::println);
                        //.collect(Collectors.toList());
        //System.out.println(employees);
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("file.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employees);
            objectOutputStream.close();
            fileOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("file.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            objectInputStream.read();
            objectInputStream.close();
            fileInputStream.close();

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
