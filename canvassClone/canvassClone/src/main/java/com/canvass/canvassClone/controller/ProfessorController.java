package com.canvass.canvassClone.controller;

import com.canvass.canvassClone.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
