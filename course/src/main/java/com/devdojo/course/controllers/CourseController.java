package com.devdojo.course.controllers;

import com.devdojo.core.entities.Course;
import com.devdojo.course.services.CourseService;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequestMapping("/course")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping()
    public ResponseEntity<Iterable<Course>> list(Pageable pageble) {
        return ResponseEntity.ok(courseService.list(pageble));
    }
}
