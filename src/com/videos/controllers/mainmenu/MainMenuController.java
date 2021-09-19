package com.videos.controllers.mainmenu;

import com.utils.Command;
import com.utils.Menu;

import com.videos.controllers.Controller;
import com.videos.models.Session;
import com.videos.persistence.UsersRepository;
import com.videos.views.mainmenu.ChangeMenuCommand;
import com.videos.views.mainmenu.CreateUserCommand;
import com.videos.views.mainmenu.ExitAppCommand;

import java.util.HashMap;
import java.util.Map;

public class MainMenuController extends Controller {

    private Map<Command, Controller> controllers;

    private CreateUserCommand createUserCommand;
    private CreateUserController createUserController;

    private ChangeMenuController changeMenuController;
    private ChangeMenuCommand changeMenuCommand;

    private ExitAppCommand exitAppCommand;
    private ExitAppController exitAppController;

    private Menu menu;
    private UsersRepository usersRepository;

    public MainMenuController(Session session) {
        super(session);
        this.usersRepository = UsersRepository.instance();
        this.controllers = new HashMap<>();
        this.createUserController = new CreateUserController(this.session, this.usersRepository);
        this.createUserCommand = new CreateUserCommand();
        this.controllers.put(this.createUserCommand, this.createUserController);
        this.changeMenuController = new ChangeMenuController(this.session, this.usersRepository);
        this.changeMenuCommand = new ChangeMenuCommand();
        this.controllers.put(this.changeMenuCommand, this.changeMenuController);
        this.exitAppController = new ExitAppController(this.session);
        this.exitAppCommand = new ExitAppCommand();
        this.controllers.put(this.exitAppCommand, this.exitAppController);
        this.menu = new Menu(this.controllers.keySet());
    }

    @Override
    public void control() {
        this.createUserCommand.setActive(true);
        this.changeMenuCommand.setActive(!this.changeMenuController.isUsersListEmpty());
        this.exitAppCommand.setActive(true);
        this.controllers.get(this.menu.execute()).control();
    }

}
