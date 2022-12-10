package com.coderoom.cashapp.exception;

public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(String message){
        super(message);
    }

    public EntityNotFoundException(){
        super();
    }
}
