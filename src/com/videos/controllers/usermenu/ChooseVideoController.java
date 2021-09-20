package com.videos.controllers.usermenu;

import com.videos.controllers.Controller;
import com.videos.models.*;
import com.videos.persistence.UsersRepository;
import com.videos.views.MessageView;
import com.videos.views.usermenu.ChooseVideoView;

public class ChooseVideoController extends Controller {

    private UsersRepository usersRepository;
    private User activeUser;

    public ChooseVideoController(Session session, UsersRepository usersRepository) {
        super(session);
        this.usersRepository = usersRepository;
    }

    @Override
    public void control() {
        this.activeUser = ActiveUser.instance();
        this.showVideos();
        String url = this.chooseUrl();
        ActiveVideo.set(this.usersRepository.getVideoByUrl(url, this.activeUser.getId()));
    }

    private void showVideos(){
        int id = this.activeUser.getId();
        for (Video video : this.usersRepository.getVideos(id)) {
            new ChooseVideoView().writeln(video.toString());
        }
    }

    private String chooseUrl(){
        int id = this.activeUser.getId();
        String[] urls = this.usersRepository.getUrls(id);
        return new ChooseVideoView().read(MessageView.CHOOSE_URL_VIDEO.getMessage(), urls);
    }

    public boolean isChoosenUser() {
        return ActiveUser.isActiveUser();
    }

    public boolean isVideosListEmpty() {
        return ActiveUser.isVideosListEmpty();
    }
}
