package com.canvass.canvassClone.service;

import com.canvass.canvassClone.model.Assignments;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
@Getter
public class ProfessorService {
    List<Assignments> assignments=new ArrayList<>();
    public boolean createAssignment(){
        assignments.add(new Assignments(1,"Assignment 1",
                "Question 1","_____","Question 2","_____"));
        assignments.add(new Assignments(2,"Assignment 2",
                "Question 1","_____","Question 2","_____"));
        return true;
    }

    public String postAssignmentEvent(){
        return "Event Posted";
    }
}
