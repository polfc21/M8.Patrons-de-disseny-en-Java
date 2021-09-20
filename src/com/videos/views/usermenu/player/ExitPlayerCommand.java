package com.videos.views.usermenu.player;

import com.utils.Command;
import com.videos.views.MessageView;

public class ExitPlayerCommand extends Command {

    public ExitPlayerCommand() {
        super(MessageView.EXIT_PLAYER.getMessage());
    }

    @Override
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
}
