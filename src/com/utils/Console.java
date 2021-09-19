package com.utils;

import java.util.Scanner;

public class Console {

    private Scanner scanner = new Scanner(System.in);

    public String readString(String title) {
        String input = null;
        boolean ok = false;
        do {
            this.write(title);
            try {
                input = this.scanner.nextLine();
                ok = true;
            } catch (Exception e) {
                this.writeError("string");
            }
        } while (!ok);
        return input;
    }

    public int readInt(String title) {
        int input = 0;
        boolean ok = false;
        do {
            try {
                input = Integer.parseInt(this.readString(title));
                ok = true;
            } catch (Exception ex) {
                this.writeError("integer");
            }
            assert ok;
        } while (!ok);
        return input;
    }

    public void write(String string) {
        System.out.print(string);
    }


    public void writeln(String string) {
        System.out.println(string);
    }

    public void writeError(String format) {
        System.out.println("FORMAT ERROR! " + "Enter a " + format + " formatted value.");
    }

}
