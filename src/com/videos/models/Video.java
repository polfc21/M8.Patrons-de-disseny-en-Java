package com.videos.models;

import com.videos.types.StateVideo;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Video {

    private String url;
    private String title;
    private LocalDateTime registryDate;
    private List<String> tags;
    private StateVideo stateVideo;

    public Video(String url, String title, LocalDateTime registryDate, List<String> tags){
        this.url = url;
        this.title = title;
        this.registryDate = registryDate;
        this.tags = tags;
    }

    public void setStateVideo(){
        long diference = ChronoUnit.MINUTES.between(this.registryDate, LocalDateTime.now());
        if (diference < 1) {
            this.stateVideo = StateVideo.UPLOADING;
        } else if (1 <= diference && diference < 3 ) {
            this.stateVideo = StateVideo.VERIFYING;
        } else {
            this.stateVideo = StateVideo.PUBLIC;
        }
    }

    @Override
    public String toString() {
        return "Video{" +
                "url='" + url + '\'' +
                ", title='" + title + '\'' +
                ", registryDate='" + registryDate + '\'' +
                ", tags=" + tags +
                ", stateVideo=" + stateVideo +
                '}';
    }

}
