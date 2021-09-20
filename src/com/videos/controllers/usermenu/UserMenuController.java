package com.videos.controllers.usermenu;

import com.utils.Command;
import com.utils.Menu;
import com.videos.controllers.Controller;

import com.videos.models.Session;
import com.videos.persistence.UsersRepository;

import com.videos.views.usermenu.*;

import java.util.HashMap;
import java.util.Map;

public class UserMenuController extends Controller {

    private Map<Command, Controller> controllers;

    private ChooseUserController chooseUserController;
    private ChooseUserCommand chooseUserCommand;

    private CreateVideoController createVideoController;
    private CreateVideoCommand createVideoCommand;

    private SeeVideosController seeVideosController;
    private SeeVideosCommand seeVideosCommand;

    private ChooseVideoController chooseVideoController;
    private ChooseVideoCommand chooseVideoCommand;

    private ChangePlayerController changePlayerController;
    private ChangePlayerCommand changePlayerCommand;

    private ExitUserMenuController exitUserMenuController;
    private ExitUserMenuCommand exitUserMenuCommand;

    private Menu menu;
    private UsersRepository usersRepository;

    public UserMenuController(Session session) {
        super(session);
        this.usersRepository = UsersRepository.instance();
        this.controllers = new HashMap<>();

        this.chooseUserController = new ChooseUserController(this.session, this.usersRepository);
        this.chooseUserCommand = new ChooseUserCommand();
        this.controllers.put(this.chooseUserCommand, this.chooseUserController);

        this.createVideoController = new CreateVideoController(this.session, this.usersRepository);
        this.createVideoCommand = new CreateVideoCommand();
        this.controllers.put(this.createVideoCommand, this.createVideoController);

        this.seeVideosController = new SeeVideosController(this.session, this.usersRepository);
        this.seeVideosCommand = new SeeVideosCommand();
        this.controllers.put(this.seeVideosCommand, this.seeVideosController);

        this.chooseVideoController = new ChooseVideoController(this.session, this.usersRepository);
        this.chooseVideoCommand = new ChooseVideoCommand();
        this.controllers.put(this.chooseVideoCommand, this.chooseVideoController);

        this.changePlayerController = new ChangePlayerController(this.session);
        this.changePlayerCommand = new ChangePlayerCommand();
        this.controllers.put(this.changePlayerCommand, this.changePlayerController);

        this.exitUserMenuController = new ExitUserMenuController(this.session);
        this.exitUserMenuCommand = new ExitUserMenuCommand();
        this.controllers.put(this.exitUserMenuCommand, this.exitUserMenuController);

        this.menu = new Menu(this.controllers.keySet());
    }

    @Override
    public void control() {
        this.chooseUserCommand.setActive(true);
        this.createVideoCommand.setActive(this.createVideoController.isChoosenUser());
        this.seeVideosCommand.setActive(this.seeVideosController.isChoosenUser() && !this.seeVideosController.isVideosListEmpty());
        this.chooseVideoCommand.setActive(this.chooseVideoController.isChoosenUser() && !this.chooseVideoController.isVideosListEmpty());
        this.changePlayerCommand.setActive(this.changePlayerController.isChoosenVideo());
        this.exitUserMenuCommand.setActive(true);
        this.controllers.get(this.menu.execute()).control();
    }

}
