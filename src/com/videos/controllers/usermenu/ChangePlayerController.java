package com.videos.controllers.usermenu;

import com.videos.controllers.Controller;
import com.videos.models.ActiveVideo;
import com.videos.models.Session;

public class ChangePlayerController extends Controller {

    public ChangePlayerController(Session session) {
        super(session);
    }

    @Override
    public void control() {
        this.session.next();
    }

    public boolean isChoosenVideo() {
        return ActiveVideo.isActiveVideo();
    }
}
