package org.example.jpastudentv2.repositories;

import org.example.jpastudentv2.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findAllByName(String name);
}
