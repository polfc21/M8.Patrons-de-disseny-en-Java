package com.videos.controllers.mainmenu;

import com.videos.controllers.Controller;
import com.videos.models.Session;
import com.videos.models.User;
import com.videos.persistence.UsersRepository;
import com.videos.views.mainmenu.CreateUserView;
import com.videos.views.MessageView;

import java.time.LocalDate;

public class CreateUserController extends Controller {

    private UsersRepository usersRepository;

    public CreateUserController(Session session, UsersRepository usersRepository) {
        super(session);
        this.usersRepository = usersRepository;
    }

    @Override
    public void control() {
        User user = this.createUser();
        this.usersRepository.add(user);
    }

    private User createUser() {
        String name = new CreateUserView().read(MessageView.READ_NAME.getMessage());
        String surname = new CreateUserView().read(MessageView.READ_SURNAME.getMessage());
        String password = new CreateUserView().read(MessageView.READ_PASSWORD.getMessage());
        String registryDate = LocalDate.now().toString();
        return new User(name, surname, password, registryDate);
    }
}
