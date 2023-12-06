package org.example.db;

import java.io.Serial;

public class DBException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = -624664469066811031L;

    public DBException(String msg) {
        super(msg);
    }
}
