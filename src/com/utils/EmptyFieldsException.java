package com.utils;

public class EmptyFieldsException extends Exception {

    private static final String MESSAGE = "Error. El camp introduït no pot estar buit.";

    public EmptyFieldsException() {
        super(EmptyFieldsException.MESSAGE);
    }

}
