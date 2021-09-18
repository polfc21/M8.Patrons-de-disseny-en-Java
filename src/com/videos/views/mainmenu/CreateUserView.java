package com.videos.views.mainmenu;

import com.utils.EmptyFields;
import com.utils.WithConsoleView;

public class CreateUserView extends WithConsoleView {

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
