package com.asterisc.in.pack.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asterisc.in.pack.model.Student;

public interface MyJpa extends JpaRepository<Student, Integer>{

}
