package com.example.course.firstSpring.service;

import com.example.course.firstSpring.entity.Course;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface CourseRedisService {
    void save(Course course);
    Map<Integer, Course> findAll();
}
