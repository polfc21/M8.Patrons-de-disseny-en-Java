package com.utils;

public class EmptyFields extends Exception {

    private static final String MESSAGE = "Error. El camp introduït no pot estar buit.";

    public EmptyFields() {
        super(EmptyFields.MESSAGE);
    }

}
