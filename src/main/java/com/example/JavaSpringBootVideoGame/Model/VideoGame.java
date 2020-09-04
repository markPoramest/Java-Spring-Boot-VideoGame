package com.example.JavaSpringBootVideoGame.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VideoGame {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String platform;

    public VideoGame() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public VideoGame(Integer id, String name, String platform) {
        this.id = id;
        this.name = name;
        this.platform = platform;
    }
}
