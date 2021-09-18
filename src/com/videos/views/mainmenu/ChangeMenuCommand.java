package com.videos.views.mainmenu;

import com.utils.Command;
import com.videos.views.MessageView;

public class ChangeMenuCommand extends Command {

    public ChangeMenuCommand() {
        super(MessageView.CHANGE_USER_MENU.getMessage());
    }

    @Override
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
}
