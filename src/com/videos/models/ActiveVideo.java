package com.videos.models;

public class ActiveVideo {

    private static Video activeVideo;

    public static Video instance(){
        activeVideo.setStateVideo();
        return activeVideo;
    }

    public static boolean isActiveVideo(){
        return activeVideo != null;
    }

    public static void set(Video video){
        activeVideo = video;
    }

    private ActiveVideo(){

    }
}
