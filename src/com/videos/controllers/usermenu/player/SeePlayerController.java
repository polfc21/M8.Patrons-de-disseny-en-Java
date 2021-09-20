package com.videos.controllers.usermenu.player;

import com.videos.controllers.Controller;
import com.videos.models.ActiveVideo;
import com.videos.models.Session;
import com.videos.models.Video;
import com.videos.views.usermenu.player.SeePlayerView;

public class SeePlayerController extends Controller {

    private Video activeVideo;

    public SeePlayerController(Session session) {
        super(session);
    }

    @Override
    public void control() {
        this.activeVideo = ActiveVideo.instance();
        this.showPlayer();
    }

    private void showPlayer(){
        new SeePlayerView().writeln(this.activeVideo.toString());
        new SeePlayerView().writeln(ActiveVideo.getActualDuration() + ":" + this.activeVideo.getDurada());
    }
}
