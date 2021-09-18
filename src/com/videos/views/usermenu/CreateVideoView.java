package com.videos.views.usermenu;

import com.utils.EmptyFields;
import com.utils.WithConsoleView;

public class CreateVideoView extends WithConsoleView {

    public String read(String message) {
        String input = "";
        boolean correctField = false;
        do {
            try {
                input = this.console.readString(message);
                if (input.equals("")) {
                    throw new EmptyFields();
                }
                correctField = true;
            } catch (EmptyFields e){
                this.console.writeln(e.getMessage());
            }
        } while (!correctField);
        return input;
    }

}
