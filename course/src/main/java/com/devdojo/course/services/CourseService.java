package com.devdojo.course.services;

import com.devdojo.core.entities.Course;
import com.devdojo.core.repositories.CourserRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    private final CourserRepository courserRepository;

    public CourseService(CourserRepository courserRepository) {
        this.courserRepository = courserRepository;
    }

    public Iterable<Course> list(Pageable pageable) {
        return courserRepository.findAll(pageable);
    }
}
