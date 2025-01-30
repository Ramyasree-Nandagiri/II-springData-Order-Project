package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.TeacherEntity;

import com.example.exception.TeacherException;
import com.example.service.dao.TeacherRepository;


@Service
public class TeacherService {
	
	
	
	@Autowired
	private  TeacherRepository myTeacherRepo;
	
//	List<TeacherEntity> myTeacher= new ArrayList<>();
//	
//	
//	public TeacherService() {
//		myTeacher.add(new TeacherEntity(1,"Ramya"));
//		myTeacher.add(new TeacherEntity(2,"kruthika"));
//	}

	
	
	public List<TeacherEntity> displayTeacher(){
		return (List<TeacherEntity>) myTeacherRepo.findAll();
//		return myTeacher;
	}
	
	
	
	
	public TeacherEntity postTeacher(TeacherEntity postTeacher) {
//		myTeacher.add(postTeacher);
		System.out.print("in service post method");
		TeacherEntity save = myTeacherRepo.save(postTeacher);
		System.out.println(save);
		return save;
//	return	myTeacherRepo.save(postTeacher);
	
//		return myTeacher;
	}
	
	
	public TeacherEntity getTeacherId( Integer teacherId) {
		
		return myTeacherRepo.findById(teacherId)
				.orElseThrow(()-> new RuntimeException("teacher not found with exception"+teacherId));
//		
//	return	myTeacher.stream().filter(response->response.getTeacherId()==teacherId)
//		.findFirst().orElseThrow(()-> new TeacherException("employee id not found"));
		
	}
	
	public TeacherEntity saveTeacher(TeacherEntity mysaveTeacher) {
		return myTeacherRepo.save(mysaveTeacher);
	}
	
	
	
	

	
	
}
