package com.projectcourse.courseprofessional.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController //gives at the client the resources that he need, so this class is marked as request handler
@RequestMapping(path = "api/v1/students")//particulary path that change the URL of the app
public class StudentController {

    @GetMapping //Annotation for mapping HTTP GET requests
    public List<Student> getAllStudents(){
        List<Student> students = Arrays.asList(
                new Student(
                        1L,
                        "Gianmarco",
                        "gianmarco.zin@gmail.com",
                        Gender.MALE
                ),
                new Student(
                        2L,
                        "Chiara",
                        "chiara.ceron@gmail.com",
                        Gender.FEMALE
                )
        );
        return students;
    }
}
