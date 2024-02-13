package org.example.jpastudentv2.config;

import org.example.jpastudentv2.model.Student;
import org.example.jpastudentv2.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class InitData implements CommandLineRunner {
    @Autowired
    StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception {
        Student s1 = new Student();
        s1.setName("Test");
        s1.setBornDate(LocalDate.of(1999,4,17));
        s1.setBornTime(LocalTime.of(4, 40,32));
        studentRepository.save(s1);
    }
}
