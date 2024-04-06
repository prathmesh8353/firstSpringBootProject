package com.springBoot.firstProject.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents() {
        return List.of(
                new Student(
                        "Prathmesh",
                        "Mali",
                        LocalDate.now(),
                        "prathmeshmali@gmail.com",
                        24
                ),
                new Student(
                        "Sudam",
                        "Mali",
                        LocalDate.now(),
                        "prathmeshmali@gmail.com",
                        59
                ),
                new Student(
                        "Latika",
                        "Mali",
                        LocalDate.now(),
                        "prathmeshmali@gmail.com",
                        50
                ),
                new Student(
                        "Susmita",
                        "Mali",
                        LocalDate.now(),
                        "prathmeshmali@gmail.com",
                        29
                )
        );
    }
}
