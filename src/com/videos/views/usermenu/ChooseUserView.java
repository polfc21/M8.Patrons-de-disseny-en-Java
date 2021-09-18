package com.videos.views.usermenu;

import com.utils.ClosedInterval;
import com.utils.WithConsoleView;

public class ChooseUserView extends WithConsoleView {

    private static final String ID_ERROR = "Error, tria un id vàlid entre 1 i ";

    public void writeln(String user){
        this.console.writeln(user);
    }

    public int read(String message, int usersListSize){
        int option;
        do {
            option = this.console.readInt(message);
            if (!new ClosedInterval(1, usersListSize).includes(option)){
                this.console.writeln(ChooseUserView.ID_ERROR + usersListSize);
            }
        } while (!new ClosedInterval(1, usersListSize).includes(option));
        return option;
    }

}
