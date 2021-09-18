package com.videos.controllers.mainmenu;

import com.videos.controllers.Controller;
import com.videos.models.Session;
import com.videos.persistence.UsersRepository;

public class ChangeMenuController extends Controller {

    private UsersRepository usersRepository;

    public ChangeMenuController(Session session, UsersRepository usersRepository) {
        super(session);
        this.usersRepository = usersRepository;
    }

    @Override
    public void control() {
        this.session.next();
    }

    public boolean isUsersListEmpty(){
        return this.usersRepository.getUsers().size() == 0;
    }
}
