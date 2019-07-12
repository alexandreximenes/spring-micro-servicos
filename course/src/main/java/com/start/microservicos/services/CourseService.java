package com.start.microservicos.services;

import com.start.microservicos.models.Course;
import com.start.microservicos.repositories.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseService {
    private final CourseRepository courseRepository;

    public List<Course> courses() {
        return courseRepository.findAll();
    }
}
