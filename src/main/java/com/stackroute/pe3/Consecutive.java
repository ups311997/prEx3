//Write a program to find out if a series of 7 digits are consecutive numbers.

package com.stackroute.pe3;

public class Consecutive
{
    boolean result = false;
    public boolean checkConsecutive(String values){
        String[] array= values.split(",");
        for(int i=0;i<array.length-1;i++){
            int difference=Integer.parseInt(array[i+1])-Integer.parseInt(array[i]);
            if(difference==1 || difference==-1){
                result=true;
            }
            else{
                result=false;
                break;
            }
        }
        return result;
    }
}

