package com.example.app.controller;

import com.example.app.service.security.SpringUser;
import com.example.model.Course;
import com.example.service.CourseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
public class CourseController {

    private final CourseService courseService;

    @GetMapping("/courses")
    public String courses(ModelMap modelMap, @AuthenticationPrincipal SpringUser springUser) {
        List<Course> courses = courseService.findAll();
        modelMap.addAttribute("courses", courses);

        return "courses";
    }

    @GetMapping("/courses/delete")
    public String deleteCourse(@RequestParam("id") int id) {
        courseService.deleteById(id);
        return "redirect:/courses";
    }

    @GetMapping("/courses/add")
    public String addCourse() {
        return "addCourse";
    }

    @PostMapping("/courses/add")
    public String addCourse(@ModelAttribute Course course) {
        courseService.save(course);
        return "redirect:/courses";

    }
}
