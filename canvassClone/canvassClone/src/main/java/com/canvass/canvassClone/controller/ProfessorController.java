package com.canvass.canvassClone.controller;

import com.canvass.canvassClone.model.Assignments;
import com.canvass.canvassClone.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Professor")
public class ProfessorController {
    @Autowired
    ProfessorService professorService;

    @GetMapping("/CreateAssignment")
    public String createAssignment(){
        return  (professorService.createAssignment())?
              professorService.postAssignmentEvent():"Event Not Posted";

    }

    @GetMapping("/ActiveAssignments")
    public List<Assignments> getActiveAssignment(){
        return professorService.getAssignments();
    }
}
