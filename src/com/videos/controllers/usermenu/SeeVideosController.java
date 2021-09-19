package com.videos.controllers.usermenu;

import com.videos.controllers.Controller;
import com.videos.models.ActiveUser;
import com.videos.models.Session;
import com.videos.models.User;
import com.videos.models.Video;
import com.videos.persistence.UsersRepository;
import com.videos.views.usermenu.SeeVideosView;

public class SeeVideosController extends Controller {

    private User activeUser;
    private UsersRepository usersRepository;

    public SeeVideosController(Session session, UsersRepository usersRepository) {
        super(session);
        this.usersRepository = usersRepository;
    }

    @Override
    public void control() {
        this.activeUser = ActiveUser.instance();
        this.showVideos(activeUser);
    }

    private void showVideos(User user){
        for (Video video : this.usersRepository.getVideos(user.getId())) {
            new SeeVideosView().writeln(video.toString());
        }
    }

    public boolean isChoosenUser() {
        return ActiveUser.isActiveUser();
    }

    public boolean isVideosListEmpty() {
        return ActiveUser.isVideosListEmpty();
    }


}
