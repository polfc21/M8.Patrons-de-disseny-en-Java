package com.videos.models;

import com.videos.types.StatusVideo;

public class ActiveVideo {

    private static Video activeVideo;
    private static int actualDuration = 0;
    private static StatusVideo statusVideo = StatusVideo.STOP;

    public static Video instance(){
        activeVideo.setStateVideo();
        return activeVideo;
    }

    public static boolean isActiveVideo(){
        return activeVideo != null;
    }

    public static StatusVideo getStatusVideo(){
        return statusVideo;
    }

    public static int getActualDuration() {
        return actualDuration;
    }

    public static void set(Video video){
        activeVideo = video;
    }

    public static void set(StatusVideo status){
        statusVideo = status;
    }

    public static void set(int duration){
        actualDuration = duration;
    }

    public static void sumSecond(){
        actualDuration++;
    }

    private ActiveVideo(){

    }

    public static void controlDuration(){
        if (actualDuration == activeVideo.getDurada()){
            statusVideo = StatusVideo.STOP;
            actualDuration = 0;
        }
    }

    public static void setNull() {
        activeVideo = null;
        actualDuration = 0;
        statusVideo = StatusVideo.STOP;
    }
}
