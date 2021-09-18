package com.videos.views.usermenu;

import com.utils.Command;
import com.videos.views.MessageView;

public class SeeVideosCommand extends Command {
    public SeeVideosCommand() {
        super(MessageView.SEE_VIDEOS.getMessage());
    }

    @Override
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
}
