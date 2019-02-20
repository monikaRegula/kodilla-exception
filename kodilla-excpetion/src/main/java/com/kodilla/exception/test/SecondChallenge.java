package com.kodilla.exception.test;

public class SecondChallenge {


    public String probablyWillThrowAnException(double x, double y) throws  ExceptionHandling {


        try{
            if (x >= 2 || x < 1 || y == 1.5){
                throw new Exception();
            }
            return "Done";
        }
        catch (Exception e){
            throw new ExceptionHandling();
        }
        finally {
            System.out.println("FINALLY");
        }

    }


    public static void main(String[] args) throws ExceptionHandling {

        SecondChallenge secondChallenge = new SecondChallenge();
        secondChallenge.probablyWillThrowAnException(5.0,1.5);
    }

}
