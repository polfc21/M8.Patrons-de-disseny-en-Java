package com.videos.controllers.usermenu.player;

import com.utils.Command;
import com.utils.Menu;
import com.videos.controllers.Controller;
import com.videos.models.ActiveVideo;
import com.videos.models.Session;
import com.videos.types.StatusVideo;
import com.videos.views.usermenu.player.*;

import java.util.HashMap;
import java.util.Map;

public class PlayerController extends Controller {

    private Map<Command, Controller> controllers;

    private PlayController playController;
    private PlayCommand playCommand;

    private PauseController pauseController;
    private PauseCommand pauseCommand;

    private StopController stopController;
    private StopCommand stopCommand;

    private SeePlayerController seePlayerController;
    private SeePlayerCommand seePlayerCommand;

    private ExitPlayerController exitPlayerController;
    private ExitPlayerCommand exitPlayerCommand;

    private Menu menu;

    public PlayerController(Session session) {
        super(session);
        this.controllers = new HashMap<>();

        this.playController = new PlayController(this.session);
        this.playCommand = new PlayCommand();
        this.controllers.put(this.playCommand, this.playController);

        this.pauseController = new PauseController(this.session);
        this.pauseCommand = new PauseCommand();
        this.controllers.put(this.pauseCommand, this.pauseController);

        this.stopController = new StopController(this.session);
        this.stopCommand = new StopCommand();
        this.controllers.put(this.stopCommand, this.stopController);

        this.seePlayerController = new SeePlayerController(this.session);
        this.seePlayerCommand = new SeePlayerCommand();
        this.controllers.put(this.seePlayerCommand, this.seePlayerController);

        this.exitPlayerController = new ExitPlayerController(this.session);
        this.exitPlayerCommand = new ExitPlayerCommand();
        this.controllers.put(this.exitPlayerCommand, this.exitPlayerController);

        this.menu = new Menu(this.controllers.keySet());
    }

    @Override
    public void control() {
        try {
            if (ActiveVideo.getStatusVideo() == StatusVideo.PLAY){
                ActiveVideo.sumSecond();
                ActiveVideo.controlDuration();
                Thread.sleep(1000);
            }
            this.playCommand.setActive(this.playController.isPaused() || this.playController.isStopped());
            this.pauseCommand.setActive(this.pauseController.isPlayed());
            this.stopCommand.setActive(this.stopController.isPaused() || this.stopController.isPlayed());
            this.seePlayerCommand.setActive(true);
            this.exitPlayerCommand.setActive(true);
            this.controllers.get(this.menu.execute()).control();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
