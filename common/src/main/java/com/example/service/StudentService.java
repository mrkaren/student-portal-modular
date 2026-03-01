package com.example.service;

import com.example.model.Course;
import com.example.model.Skill;
import com.example.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface StudentService {

    Page<Student> findAll(Pageable pageable);

    Student save(Student student, MultipartFile multipartFile);

    List<Student> findByCourse(Course course);

    List<Student> findBySkill(Skill skill);

    Page<Student> findAllWithSpecification(Specification<Student> spec);

}
