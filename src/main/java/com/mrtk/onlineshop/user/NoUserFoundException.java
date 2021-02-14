package com.mrtk.onlineshop.user;

public class NoUserFoundException extends RuntimeException {

    public NoUserFoundException(String message) {
        super(message);
    }
}
