package com.utils;

public class DurationFieldException extends Exception{

    private static final String MESSAGE = "Error. La durada introduïda no pot ser igual o menor a 0.";

    public DurationFieldException() {
        super(DurationFieldException.MESSAGE);
    }
}
