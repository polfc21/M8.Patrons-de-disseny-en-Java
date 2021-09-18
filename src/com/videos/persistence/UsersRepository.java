package com.videos.persistence;

import com.videos.models.User;
import com.videos.models.Video;

import java.util.ArrayList;
import java.util.List;

public class UsersRepository {

    private static UsersRepository usersRepository;
    private static List<User> users;

    public static UsersRepository instance() {
        if (usersRepository == null) {
            usersRepository = new UsersRepository();
        }
        return usersRepository;
    }

    private UsersRepository(){
        this.users = new ArrayList<>();
    }

    public List<User> getUsers() {
        return this.users;
    }

    public List<Video> getVideos(int id) {
        return this.users.get(id-1).getVideos();
    }

    public User get(int id) {
        return this.users.get(id-1);
    }

    public void add(User user) {
        this.users.add(user);
    }

    public void add(Video video, int id){
        this.users.get(id-1).add(video);
    }

}
