package com.videos.controllers.mainmenu;

import com.videos.controllers.Controller;
import com.videos.models.Session;
import com.videos.models.User;
import com.videos.persistence.UsersRepository;
import com.videos.views.FieldsView;
import com.videos.views.MessageView;

import java.time.LocalDateTime;

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
    //Patró creacional per a User
    private User createUser() {
        String name = new FieldsView().read(MessageView.READ_NAME.getMessage());
        String surname = new FieldsView().read(MessageView.READ_SURNAME.getMessage());
        String password = new FieldsView().read(MessageView.READ_PASSWORD.getMessage());
        LocalDateTime registryDate = LocalDateTime.now();
        return new User(name, surname, password, registryDate);
    }
}
