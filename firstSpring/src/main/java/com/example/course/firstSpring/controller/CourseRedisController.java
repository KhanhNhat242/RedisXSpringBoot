package com.example.course.firstSpring.controller;

import com.example.course.firstSpring.entity.Course;
import com.example.course.firstSpring.service.CourseRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CourseRedisController {

    @Autowired
    private CourseRedisService courseRedisService;

    @PostMapping("/saveToRedis")
    public void save(@RequestBody Course course){
        courseRedisService.save(course);
    }

    @GetMapping("findFromRedis")
    public Map<Integer, Course> findAll(){
        return courseRedisService.findAll();
    }
}
