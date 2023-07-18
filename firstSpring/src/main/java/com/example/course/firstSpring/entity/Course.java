package com.example.course.firstSpring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Entity
@Data
@RedisHash("Course")
public class Course implements Serializable {
    @Id
    private int id;
    private String imgPath;
    private String name;
    private double price;

    public Course(){
    }
    public int getId() {
        return id;
    }

    public Course(int id, String imgPath, String name, double price) {
        this.id = id;
        this.imgPath = imgPath;
        this.name = name;
        this.price = price;
    }

    public Course(int id) {
        this.id = id;
    }

    public String getImgPath() {
        return imgPath;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", imgPath='" + imgPath + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
