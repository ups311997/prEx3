//Write a java program to calculate first and last date of a week.

package com.stackroute.pe3;


import java.util.*;
import java.time.*;
import java.text.*;

public class Mydate {
    public boolean checkDate() {

        Calendar c = Calendar.getInstance();


        // Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        // Print dates of the current week starting on Monday
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");

         String string=df.format(c.getTime());


        if(string.equals("Mon 18/02/2019"))
            return true;
            else
        return false;




    }
    public boolean endDate()
    {
        Calendar c = Calendar.getInstance();


        // Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        // Print dates of the current week starting on Monday
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");


        {
            c.add(Calendar.DATE, 6);
        }


        String string1=df.format(c.getTime());
        if(string1.equals("Sun 24/02/2019"))
            return true;
        else
            return false;
    }

}





