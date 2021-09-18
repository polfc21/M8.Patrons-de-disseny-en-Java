package com.videos.views.mainmenu;

import com.utils.Command;
import com.videos.views.MessageView;

public class ExitAppCommand extends Command {

    public ExitAppCommand() {
        super(MessageView.EXIT.getMessage());
    }
    @Override
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
}
