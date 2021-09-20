package com.videos.views.usermenu;

import com.utils.Command;
import com.videos.views.MessageView;

public class ChooseVideoCommand extends Command {

    public ChooseVideoCommand() {
        super(MessageView.CHOOSE_VIDEO.getMessage());
    }

    @Override
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
}
