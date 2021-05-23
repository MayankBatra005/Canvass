package com.canvass.canvassClone.controller;

import com.canvass.canvassClone.model.Assignments;
import com.canvass.canvassClone.model.Students;
import com.canvass.canvassClone.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Student")
public class StudentController {
    @Autowired
    StudentService studentService;

    List<Students> students=new ArrayList<>();

    @GetMapping("/Students")
    public List<Students> getStudents(){

        return students;
    }

    @PostMapping("/Students")
    public void createStudents(@RequestBody Students student){
        System.out.println(student.getId());
        students.add(student);
    }

    @DeleteMapping
    public boolean deleteStudent(){
        if (students.size()>=1){
            students.remove(0);

        return true;
        }
        return false;
    }

    @PostMapping("/CompleteAssignment")
    public String completeAssignment(@RequestBody List<Assignments> assignments){
        return studentService.completeAssignment(assignments)?
                studentService.postAssignmentCompletionNotification():"Don't Post";
    }

}
