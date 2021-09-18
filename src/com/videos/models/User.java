package com.videos.models;

import java.util.ArrayList;
import java.util.List;

public class User {

    private static int numUsers = 1;
    private int id;
    private String name;
    private String surname;
    private String password;
    private String registryDate;
    private List<Video> videos;

    public User(String name, String surname, String password, String registryDate) {
        this.id = numUsers;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.registryDate = registryDate;
        this.videos = new ArrayList<>();
        this.numUsers++;
    }

    public void add(Video video){
        this.videos.add(video);
    }

    public int getId() {
        return this.id;
    }

    public List<Video> getVideos() {
        return this.videos;
    }

    public boolean isVideoListEmpty() {
        return this.videos.size() == 0;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", password='" + password + '\'' +
                ", registryDate='" + registryDate + '\'' +
                '}';
    }
}
