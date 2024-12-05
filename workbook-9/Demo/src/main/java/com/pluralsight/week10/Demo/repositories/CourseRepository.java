package com.pluralsight.week10.Demo.repositories;


import com.pluralsight.week10.Demo.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CourseRepository extends JpaRepository<Course, Long> {
}
