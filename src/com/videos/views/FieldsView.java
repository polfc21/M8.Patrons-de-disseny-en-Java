package com.videos.views;

import com.utils.DurationFieldException;
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

    public int readInt(String message) {
        int input = 0;
        boolean correctField = false;
        do {
            try {
                input = this.console.readInt(message);
                if (input <= 0) {
                    throw new DurationFieldException();
                }
                correctField = true;
            } catch (DurationFieldException e){
                this.console.writeln(e.getMessage());
            }
        } while (!correctField);
        return input;
    }
}
