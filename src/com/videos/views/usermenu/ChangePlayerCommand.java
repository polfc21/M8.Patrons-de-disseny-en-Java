package com.videos.views.usermenu;

import com.utils.Command;
import com.videos.views.MessageView;

public class ChangePlayerCommand extends Command {

    public ChangePlayerCommand() {
        super(MessageView.PLAYER_VIDEO.getMessage());
    }

    @Override
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
}
