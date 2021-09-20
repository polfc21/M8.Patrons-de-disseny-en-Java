package com.videos.views.usermenu.player;

import com.utils.Command;
import com.videos.views.MessageView;

public class PauseCommand extends Command {

    public PauseCommand() {
        super(MessageView.PAUSE_VIDEO.getMessage());
    }

    @Override
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
}
