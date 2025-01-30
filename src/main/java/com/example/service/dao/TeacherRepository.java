package com.example.service.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.TeacherEntity;

@Repository
public interface TeacherRepository extends CrudRepository<TeacherEntity, Integer>{

}
