package com.videos.controllers.usermenu;

import com.videos.controllers.Controller;
import com.videos.models.*;
import com.videos.persistence.UsersRepository;
import com.videos.views.FieldsView;
import com.videos.views.MessageView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CreateVideoController extends Controller {

    private UsersRepository usersRepository;

    public CreateVideoController(Session session, UsersRepository usersRepository) {
        super(session);
        this.usersRepository = usersRepository;
    }

    @Override
    public void control() {
        Video video = this.createVideo();
        this.usersRepository.add(video, ActiveUser.instance().getId());
    }

    //Patró creacional per a Video
    private Video createVideo() {
        String url = new FieldsView().read(MessageView.READ_URL.getMessage());
        String title = new FieldsView().read(MessageView.READ_TITLE.getMessage());
        LocalDateTime registryDate = LocalDateTime.now();
        String allTags = new FieldsView().read(MessageView.READ_TAG.getMessage());
        List<String> tags = this.getTagList(allTags);
        return new Video(url, title, registryDate, tags);
    }

    private List<String> getTagList(String allTags){
        String[] separatedTags = allTags.split(" ");
        List<String> tags = new ArrayList<>();
        for (int i = 0; i < separatedTags.length; i++) {
            tags.add(separatedTags[i]);
        }
        return tags;
    }

    public boolean isChoosenUser() {
        return ActiveUser.isActiveUser();
    }

}
