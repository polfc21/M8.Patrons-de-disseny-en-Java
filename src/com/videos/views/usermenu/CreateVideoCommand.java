package com.videos.views.usermenu;

import com.utils.Command;
import com.videos.views.MessageView;

public class CreateVideoCommand extends Command {

    public CreateVideoCommand() {
        super(MessageView.CREATE_VIDEO.getMessage());
    }

    @Override
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
}
