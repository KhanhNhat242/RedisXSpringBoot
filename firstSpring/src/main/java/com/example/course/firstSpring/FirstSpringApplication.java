package com.example.course.firstSpring;

import com.example.course.firstSpring.entity.Course;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.serializer.GenericToStringSerializer;

@SpringBootApplication
public class FirstSpringApplication {
	@Bean
	public RedisTemplate<Integer, Course> redisTemplate(){
		RedisTemplate redisTemplate = new RedisTemplate<>();
		redisTemplate.setConnectionFactory(jedisConnectionFactory());
		redisTemplate.setValueSerializer(new GenericToStringSerializer<Object>(Object.class));
		return redisTemplate;
	}

	@Bean
	public JedisConnectionFactory jedisConnectionFactory(){
		return new JedisConnectionFactory();
	}

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringApplication.class, args);
	}

}
