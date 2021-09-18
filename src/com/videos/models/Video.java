package com.videos.models;

import java.util.List;

public class Video {

    private String url;
    private String title;
    private String registryDate;
    private List<String> tags;

    public Video(String url, String title, String registryDate, List<String> tags){
        this.url = url;
        this.title = title;
        this.registryDate = registryDate;
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Video{" +
                "url='" + url + '\'' +
                ", title='" + title + '\'' +
                ", registryDate='" + registryDate + '\'' +
                ", tags=" + tags +
                '}';
    }
}
