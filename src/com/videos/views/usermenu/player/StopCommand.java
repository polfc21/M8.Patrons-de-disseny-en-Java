package com.videos.views.usermenu.player;

import com.utils.Command;
import com.videos.views.MessageView;

public class StopCommand extends Command {

    public StopCommand() {
        super(MessageView.STOP_VIDEO.getMessage());
    }

    @Override
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
}
