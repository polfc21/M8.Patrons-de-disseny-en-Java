package com.videos.views.usermenu.player;

import com.utils.Command;
import com.videos.views.MessageView;

public class PlayCommand extends Command {

    public PlayCommand() {
        super(MessageView.PLAY_VIDEO.getMessage());
    }

    @Override
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
}
