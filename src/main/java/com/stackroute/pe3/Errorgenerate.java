//Write a program that will generate exceptions of type NegativeArraySizeException,
//IndexOutOfBoundsException, NullPointerException. Record the catching of each exception by
//displaying the message stored in the exception object.



package com.stackroute.pe3;

public class Errorgenerate {
    public static void main(String[] args) {
        try{
            throw new NegativeArraySizeException();
        }
        catch(NegativeArraySizeException e1){
            System.out.println(e1.toString());
        }

        try{
            throw new IndexOutOfBoundsException();
        }
        catch (IndexOutOfBoundsException e2){
            System.out.println(e2.toString());
        }

        try{
            throw new NullPointerException();
        }
        catch(NullPointerException e3){
            System.out.println(e3.toString());
        }
    }

}
