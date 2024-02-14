package com.araujocode.course.services.exceptions;

import java.io.Serial;

public class DatabaseException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 7095983681504659817L;

    public DatabaseException(String msg) {
        super(msg);
    }
}
