package com.videos.controllers.usermenu.player;

import com.videos.controllers.Controller;
import com.videos.models.ActiveVideo;
import com.videos.models.Session;
import com.videos.types.StatusVideo;

public class StopController extends Controller {

    public StopController(Session session) {
        super(session);
    }

    @Override
    public void control() {
        ActiveVideo.set(StatusVideo.STOP);
        ActiveVideo.set(0);
    }

    public boolean isPlayed() {
        return ActiveVideo.getStatusVideo() == StatusVideo.PLAY;
    }

    public boolean isPaused() {
        return ActiveVideo.getStatusVideo() == StatusVideo.PAUSE;
    }
}
