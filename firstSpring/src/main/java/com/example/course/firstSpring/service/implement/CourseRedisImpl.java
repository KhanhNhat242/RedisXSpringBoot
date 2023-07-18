package com.example.course.firstSpring.service.implement;

import com.example.course.firstSpring.entity.Course;
import com.example.course.firstSpring.service.CourseRedisService;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class CourseRedisImpl implements CourseRedisService {
    private RedisTemplate<Integer, Course> template;
    private HashOperations operations;

    public CourseRedisImpl(RedisTemplate<Integer, Course> redisTemplate) {
        this.template = redisTemplate;
        operations = redisTemplate.opsForHash();
    }

    @Override
    public void save(Course course){
        operations.put("COURSE", course.getId(), course);
    }

    @Override
    public Map<Integer, Course> findAll(){
        return operations.entries("COURSE");
    }
}
