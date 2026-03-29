package com.example.rest.mapper;

import com.example.model.Course;
import com.example.rest.dto.CourseDto;
import com.example.rest.dto.SaveCourseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

@Mapper(componentModel = "spring", imports = {BigDecimal.class, RoundingMode.class})
public abstract class CourseMapper {


    public abstract CourseDto toDto(Course course);

    @Mapping(target = "name", source = "saveCourseDto.courseName")
    public abstract Course toEntity(SaveCourseDto saveCourseDto);

    public abstract List<CourseDto> toDtoList(List<Course> courses);

}
