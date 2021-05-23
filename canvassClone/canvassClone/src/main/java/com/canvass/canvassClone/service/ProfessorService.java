package com.canvass.canvassClone.service;

import com.canvass.canvassClone.model.Assignments;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Getter
@Service
public class ProfessorService {
    private String topic="Assignments";

    @Autowired
    private KafkaTemplate<String,Assignments> kafkaTemplate;


    List<Assignments> assignments=new ArrayList<>();
    public boolean createAssignment(){
        assignments.add(new Assignments(1,"Assignment 1",
                "Question 1","_____","Question 2","_____"));
        assignments.add(new Assignments(2,"Assignment 2",
                "Question 1","_____","Question 2","_____"));
        return true;
    }

    public String postAssignmentEvent(){
        System.out.println("Sending the message");
        kafkaTemplate.send(topic,assignments.get(0));
        return "Event Posted";
    }
}
