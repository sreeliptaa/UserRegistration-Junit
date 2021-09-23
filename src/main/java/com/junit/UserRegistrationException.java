package com.junit;

public class UserRegistrationException extends Exception{
    public ExceptionType type;
    enum ExceptionType{
        ENTERED_NULL, ENTERED_EMPTY
    }

    public UserRegistrationException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }

}
