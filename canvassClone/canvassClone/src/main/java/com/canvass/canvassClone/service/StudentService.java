package com.canvass.canvassClone.service;

import com.canvass.canvassClone.model.Assignments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    @Autowired
    ProfessorService professorService;

    public boolean completeAssignment(List<Assignments> assignments){
        int i=0;
        while(i<assignments.size()){
           professorService.getAssignments().get(i).setAnswer1(
        assignments.get(i).getAnswer1());
            professorService.getAssignments().get(i).setAnswer2(
                    assignments.get(i).getAnswer2());
            i++;
        }

        return true;
    }

    public String postAssignmentCompletionNotification(){
        return "Posted";
    }

    // Message here is an assignment
    @KafkaListener(topics="Assignments",groupId = "Students")
    public void consumeTopic(Assignments assignments){
        System.out.println(assignments.getName());
    }
}
