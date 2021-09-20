package com.videos.controllers.usermenu.player;

import com.videos.controllers.Controller;
import com.videos.models.ActiveVideo;
import com.videos.models.Session;
import com.videos.types.StatusVideo;

public class PlayController extends Controller {

    public PlayController(Session session) {
        super(session);
    }

    @Override
    public void control() {
        ActiveVideo.set(StatusVideo.PLAY);
    }

    public boolean isPaused() {
        return ActiveVideo.getStatusVideo() == StatusVideo.PAUSE;
    }

    public boolean isStopped(){
        return ActiveVideo.getStatusVideo() == StatusVideo.STOP;
    }
}
