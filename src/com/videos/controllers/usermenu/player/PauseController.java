package com.videos.controllers.usermenu.player;

import com.videos.controllers.Controller;
import com.videos.models.ActiveVideo;
import com.videos.models.Session;
import com.videos.types.StatusVideo;

public class PauseController extends Controller {

    public PauseController(Session session) {
        super(session);
    }

    @Override
    public void control() {
        ActiveVideo.set(StatusVideo.PAUSE);
    }

    public boolean isPlayed() {
        return ActiveVideo.getStatusVideo() == StatusVideo.PLAY;
    }
}
