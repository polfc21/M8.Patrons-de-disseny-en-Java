package com.videos.controllers.usermenu;


import com.videos.controllers.Controller;
import com.videos.models.ActiveUser;
import com.videos.models.Session;
import com.videos.models.User;
import com.videos.persistence.UsersRepository;
import com.videos.views.MessageView;
import com.videos.views.usermenu.ChooseUserView;

public class ChooseUserController extends Controller {

    private UsersRepository usersRepository;

    public ChooseUserController(Session session, UsersRepository usersRepository) {
        super(session);
        this.usersRepository = usersRepository;
    }

    @Override
    public void control() {
        this.showUsers();
        ActiveUser.set(this.usersRepository.getUserById(this.chooseId()));
    }

    private void showUsers(){
        for (User user : this.usersRepository.getUsers()) {
            new ChooseUserView().writeln(user.toString());
        }
    }

    private int chooseId(){
        return new ChooseUserView()
                .read(MessageView.CHOOSE_ID_USER.getMessage(), this.usersRepository.getSizeUsers());
    }
}
