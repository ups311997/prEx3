//Write a program to create a ChessBoard pattern with the help of multidimensional array, where
//WWrepresents white color and BB represents Black color.
package com.stackroute.pe3;




public class Chess {


        public String [][]  checkChess(int rows,int cols)
        {
            String output[][]= new String[rows][cols];
            for (int i=0; i<rows; i++)
            {
                for (int j=0; j<cols; j++)
                {
                    if(((i+j)%2)==0)
                    {
                        output[i][j]="WW";
                    }
                    else
                    {
                        output[i][j]="BB";
                    }

                }


            }

            return output;
        }
    }

