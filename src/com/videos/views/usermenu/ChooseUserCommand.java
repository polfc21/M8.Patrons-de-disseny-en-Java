package com.videos.views.usermenu;

import com.utils.Command;
import com.videos.views.MessageView;

public class ChooseUserCommand extends Command {

    public ChooseUserCommand(){
        super(MessageView.CHOOSE_USER.getMessage());
    }

    @Override
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

}
