package com.videos.models;

public class ActiveUser {

    private static User activeUser;

    public static User instance(){
        return activeUser;
    }

    public static boolean isActiveUser(){
        return activeUser != null;
    }

    public static boolean isVideosListEmpty(){
        return activeUser.isVideoListEmpty();
    }

    public static void set(User user){
        activeUser = user;
    }

    private ActiveUser(){

    }

}
