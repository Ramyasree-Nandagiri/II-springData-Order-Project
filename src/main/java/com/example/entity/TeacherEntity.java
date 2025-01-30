package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class TeacherEntity {
	
	@Id
	@Column(name="teacherId")
	private Integer teacherId;
	@Column(name="teacherName")
	public String teacherName;
	
	
	public TeacherEntity() {
		
	}
	
	public TeacherEntity(Integer teacherId,String teacherName) {
		this.teacherId=teacherId;
		this.teacherName= teacherName;
	}
	
	public void setTeacherId(Integer teacherId) {
		this.teacherId=teacherId;
	}
	
	public Integer getTeacherId() {
		return this.teacherId;
	}
	
	
	public void setTeacherName(String teacherName) {
		this.teacherName= teacherName;
	}
	
	public String getTeacherName() {
		return teacherName;
	}
}


