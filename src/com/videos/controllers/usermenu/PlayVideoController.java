package com.videos.controllers.usermenu;

import com.videos.controllers.Controller;
import com.videos.models.ActiveVideo;
import com.videos.models.Session;

public class PlayVideoController extends Controller {

    public PlayVideoController(Session session) {
        super(session);
    }

    @Override
    public void control() {
        System.out.println(ActiveVideo.instance().toString());
    }

    public boolean isChoosenVideo() {
        return ActiveVideo.isActiveVideo();
    }
}
