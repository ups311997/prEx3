//Write a program to set up an array of places, Loop round and remove the vowels. Display the new
//words in console


package com.stackroute.pe3;


public class Myplaces {

    public String[] removeVowels(String s[]) {


         for (int i=0; i<s.length; i++)
         {
             s[i] = s[i].replaceAll("[AaEeIiOoUu]", "");

         }



        return s;
    }

}

