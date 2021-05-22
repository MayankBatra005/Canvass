package com.canvass.canvassClone;

import com.canvass.canvassClone.service.ProfessorService;
import com.canvass.canvassClone.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CanvassCloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(CanvassCloneApplication.class, args);
	}
	@Bean
	public ProfessorService getProfessorService(){
		return new ProfessorService();
	}

	@Bean
	public StudentService getStudentService(){
		return new StudentService();
	}
}
