package com.videos.controllers.usermenu.player;

import com.videos.controllers.Controller;
import com.videos.models.ActiveVideo;
import com.videos.models.Session;

public class ExitPlayerController extends Controller {

    public ExitPlayerController(Session session) {
        super(session);
    }

    @Override
    public void control() {
        ActiveVideo.setNull();
        this.session.previous();
    }
}
