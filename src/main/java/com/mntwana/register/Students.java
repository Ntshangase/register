package com.mntwana.register;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
public class Students {
    
    private String name;
    private String surname;
    private String course;
    private int studentId;
    
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getCourse() {
        return course;
    }
    public int getStudentId() {
        return studentId;
    }

    @GetMapping("/users")
    public String Display() {

        Students users = new Students();
        users.setName("Simphiwe");
        users.setSurname("Ntshangase");
        users.setCourse("Information Technology");
        users.setStudentId(22232239);

        return users.name + users.surname + users.course + users.studentId;
    }
}