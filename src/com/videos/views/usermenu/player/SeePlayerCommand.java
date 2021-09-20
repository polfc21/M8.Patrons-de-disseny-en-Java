package com.videos.views.usermenu.player;

import com.utils.Command;
import com.videos.views.MessageView;

public class SeePlayerCommand extends Command {

    public SeePlayerCommand() {
        super(MessageView.SEE_PLAYER.getMessage());
    }

    @Override
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
}
