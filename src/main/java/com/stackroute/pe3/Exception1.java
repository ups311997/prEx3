//Create a class with a main( ) that throws an object of class Exception inside a try block.

package com.stackroute.pe3;

public class Exception1 {



 Exception1(String msg)
 {
     msg="this is bound to be executed";
     System.out.println(msg);
 }
    public static void main(String[] args)throws Exception
    {
        try
        {
            throw new Exception();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println(e.toString());
        }

        finally
        {
            System.out.println("i will get printed");
        }

    }


}