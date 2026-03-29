package com.example.rest.mapper;

import com.example.model.Student;
import com.example.rest.dto.StudentDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class StudentMapper {

    @Mapping(target = "courseName", source = "student.course.name")
    public abstract StudentDto toDto(Student student);

    public abstract List<StudentDto> toDtoList(List<Student> students);

}
