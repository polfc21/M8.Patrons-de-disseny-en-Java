package com.videos.views.usermenu;

import com.utils.Command;
import com.videos.views.MessageView;

public class PlayVideoCommand extends Command {

    public PlayVideoCommand() {
        super(MessageView.PLAY_VIDEO.getMessage());
    }

    @Override
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
}
