package com.videos.views.mainmenu;

import com.utils.Command;
import com.videos.views.MessageView;

public class CreateUserCommand extends Command {

    public CreateUserCommand(){
        super(MessageView.CREATE_USER.getMessage());
    }
    @Override
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
}
