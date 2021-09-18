package com.utils;

import java.util.ArrayList;
import java.util.Set;

public class Menu extends WithConsoleView {

    private static final String OPTION = "----- Tria una opció -----";
    private static final String OPTION_ERROR = "Error, tria una opció vàlida entre 1 i ";

    private ArrayList<Command> commandSet;

    public Menu(Set<Command> commandSet) {
        this.commandSet = new ArrayList<>(commandSet);
    }
    public Command execute() {
        ArrayList<Command> commands = new ArrayList<>();
        for (int i = 0; i < this.commandSet.size(); i++) {
            if (this.commandSet.get(i).isActive()) {
                commands.add(this.commandSet.get(i));
            }
        }
        boolean error;
        int option;
        do {
            error = false;
            this.console.writeln(Menu.OPTION);
            for (int i = 0; i < commands.size(); i++) {
                this.console.writeln((i + 1) + ") " + commands.get(i).getTitle());
            }
            option = this.console.readInt("") - 1;
            if (!new ClosedInterval(0, commands.size()-1).includes(option)) {
                error = true;
                this.console.writeln(Menu.OPTION_ERROR + commands.size());
            }
        } while (error);
        return commands.get(option);
    }

}
