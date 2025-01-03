package com.devdojo.core.repositories;

import com.devdojo.core.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourserRepository extends JpaRepository<Course, Long> {
}
