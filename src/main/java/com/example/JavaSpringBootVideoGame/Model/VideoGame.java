package com.example.JavaSpringBootVideoGame.Model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

enum Platform {PC , PS4 , Nintendo_Switch , X_Box_1}

public class VideoGame {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private List<Platform> platformList;

    public VideoGame(Integer id, String name, List<Platform> platformList) {
        this.id = id;
        this.name = name;
        this.platformList = platformList;
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

    public List<Platform> getPlatformList() {
        return platformList;
    }

    public void setPlatformList(List<Platform> platformList) {
        this.platformList = platformList;
    }
}
