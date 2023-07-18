//package com.example.course.firstSpring.controller;
//
//import com.example.course.firstSpring.entity.Course;
//import com.example.course.firstSpring.service.CourseService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class courseController {
//    @Autowired
//    private CourseService service;
//
//    @PostMapping("/save")
//    public Course addCourse(@RequestBody Course course){
//        Course c = service.save(course);
//        return c;
//    }
//
//    @GetMapping("/findAll")
//    public List<Course> findAll(){
//        List<Course> listCourse = service.findAll();
//        return listCourse;
//    }
//}
