package com.kodilla.exception.nullpointer;

public class NullPointerExceptionRunner {

    public static void main(String[] args) {

        User user = null;
        MessageSender messageSender = new MessageSender();

        try{
            messageSender.sendMessageTO(user,"Hello!");
        }
        catch (MessageNotSentException e) {
            System.out.println("Message is not send. But my program ist still running.");
        }

        System.out.println("Processing other logic");
    }


}
