package com.videos.views.usermenu;

import com.utils.Command;
import com.videos.views.MessageView;

public class ExitUserMenuCommand extends Command {

    public ExitUserMenuCommand() {
        super(MessageView.EXIT_USER_MENU.getMessage());
    }

    @Override
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
}
