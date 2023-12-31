//package com.example.course.firstSpring.config;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.connection.RedisPassword;
//import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
//import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
//import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
//import org.springframework.data.redis.serializer.GenericToStringSerializer;
//import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
//import org.springframework.data.redis.serializer.StringRedisSerializer;
//
//import java.time.Duration;
//
//@Configuration
//@EnableRedisRepositories
//public class RedisConfig {
//
////    public static  final long REDIS_CONNECT_TIMEOUT_SECS = 10L;
////
////    @Bean
////    public RedisStandaloneConfiguration redisStandaloneConfiguration() {
////        final RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration();
////        redisStandaloneConfiguration.setHostName("localhost");
////        redisStandaloneConfiguration.setPort(6379);
//////Credentials hidden for code sharing purpose.
////        return redisStandaloneConfiguration;
////    }
//
//    @Bean
//    public JedisConnectionFactory redisConnectionFactory() {
////        final JedisClientConfiguration jedisClientConfiguration = JedisClientConfiguration.builder()
////                .connectTimeout(Duration.ofSeconds(REDIS_CONNECT_TIMEOUT_SECS))
////                .useSsl()
////                .build();
////
////        return new JedisConnectionFactory(redisStandaloneConfiguration(), jedisClientConfiguration);
//        RedisStandaloneConfiguration configuration = new RedisStandaloneConfiguration();
//        configuration.setHostName("Localhost");
//        configuration.setPort(6379);
//        return new JedisConnectionFactory(configuration);
//    }
//
//    @Bean
//    public RedisTemplate<String, Object> redisTemplate() {
//        RedisTemplate<String, Object> template = new RedisTemplate<>();
//        template.setConnectionFactory(redisConnectionFactory());
//        template.setKeySerializer(new StringRedisSerializer());
//        template.setHashKeySerializer(new StringRedisSerializer());
//        template.setHashKeySerializer(new JdkSerializationRedisSerializer());
//        template.setValueSerializer(new JdkSerializationRedisSerializer());
//        template.setEnableTransactionSupport(true);
//        template.afterPropertiesSet();
//        return template;
//    }
//}
