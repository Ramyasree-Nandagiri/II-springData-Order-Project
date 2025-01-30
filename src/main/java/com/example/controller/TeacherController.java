package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.TeacherEntity;
import com.example.service.TeacherService;

@RestController
public class TeacherController {
	
	@Autowired
	private TeacherService demoserviceteacher;
	
	@PostMapping("/postteacherDetails")
	public ResponseEntity<TeacherEntity> postTeacher(@RequestBody TeacherEntity mydemo){
System.out.println("post teacher method");		
		TeacherEntity a = demoserviceteacher.postTeacher(mydemo); 
		System.out.println("value of a"+a);
		return new ResponseEntity<TeacherEntity>(a, HttpStatus.OK);	
	}
	
	@GetMapping("/getTeacherId/{teacherId}")
	public ResponseEntity<TeacherEntity> getTeacher(@PathVariable Integer teacherId) {
		TeacherEntity getId = demoserviceteacher.getTeacherId(teacherId);
		return new ResponseEntity<TeacherEntity>(getId,HttpStatus.CREATED);
		
	}
	
	
	@PostMapping("/saveTeacher")
	public TeacherEntity saveTeacher(@RequestBody TeacherEntity mysaveTeacher) {
		return demoserviceteacher.saveTeacher(mysaveTeacher);
		
	}
	
	

}
