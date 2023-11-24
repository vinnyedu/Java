package org.example.exceptions;

import java.io.Serial;

public class DomainException extends Exception{

    @Serial
    private static final long serialVersionUID = 2991346862769337110L;
    public DomainException(String msg){
        super(msg);
    }
}
