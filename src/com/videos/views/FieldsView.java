package com.videos.views;

import com.utils.EmptyFieldsException;
import com.utils.WithConsoleView;

public class FieldsView extends WithConsoleView {

    public String read(String message) {
        String input = "";
        boolean correctField = false;
        do {
            try {
                input = this.console.readString(message);
                if (input.equals("")) {
                    throw new EmptyFieldsException();
                }
                correctField = true;
            } catch (EmptyFieldsException e){
                this.console.writeln(e.getMessage());
            }
        } while (!correctField);
        return input;
    }
}
