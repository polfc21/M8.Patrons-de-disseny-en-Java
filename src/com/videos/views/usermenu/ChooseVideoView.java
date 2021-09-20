package com.videos.views.usermenu;

import com.utils.WithConsoleView;

public class ChooseVideoView extends WithConsoleView {

    private static final String ID_ERROR = "Error, tria una url vàlida entre les següents: ";

    public void writeln(String user){
        this.console.writeln(user);
    }

    public String read(String message, String[] urls){
        String option;
        boolean correctUrl;
        do {
            option = this.console.readString(message);
            correctUrl = this.isCorrect(option, urls);
            if (!correctUrl) {
                this.console.writeln(ChooseVideoView.ID_ERROR + this.toString(urls));
            }
        } while (!correctUrl);
        return option;
    }

    private boolean isCorrect(String url, String[] urls){
        for (int i = 0; i < urls.length; i++) {
            if (urls[i].equals(url)) {
                return true;
            }
        }
        return false;
    }

    private String toString(String[] urls) {
        String allUrls = "";
        for (int i = 0; i < urls.length; i++) {
            allUrls += urls[i] + ",";
        }
        return allUrls;
    }
}
