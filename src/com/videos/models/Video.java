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
    private int durada;
    private StateVideo stateVideo;

    public Video(String url, String title, LocalDateTime registryDate, List<String> tags, int durada){
        this.url = url;
        this.title = title;
        this.registryDate = registryDate;
        this.tags = tags;
        this.durada = durada;
    }

    public String getUrl() {
        return this.url;
    }

    public int getDurada() {
        return this.durada;
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
                ", registryDate=" + registryDate +
                ", tags=" + tags +
                ", durada=" + durada +
                ", stateVideo=" + stateVideo +
                '}';
    }
}
