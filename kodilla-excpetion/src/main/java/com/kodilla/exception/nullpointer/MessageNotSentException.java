package com.kodilla.exception.nullpointer;

public class MessageNotSentException extends Exception {
//wyjątek dziedziczy po klasie Exception dzięki temu ten wyjątek jest checked
    //i jego obsługa jest wymagana

    public MessageNotSentException(final String message){
        super(message);
    }

}
