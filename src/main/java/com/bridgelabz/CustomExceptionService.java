package com.bridgelabz;

public class CustomExceptionService extends RuntimeException {
    public enum ExceptionType {
        FILE_NOT_FOUND,
        WRONG_FILE_TYPE,
        WRONG_HEADER
    }

    public ExceptionType type;

    public CustomExceptionService(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }

}
