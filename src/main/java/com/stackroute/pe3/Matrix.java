//Write a program to compute the addition of two matrix, Read the number of rows and columns
//as input, also the values of each matrix


package com.stackroute.pe3;



public class Matrix {


        public int[][] addMatrix(int rows,int cols,int arr1[][],int arr2[][])
        {
            int  c, d;
            int[][] sum=new int[rows][cols];






            for (c = 0; c < rows; c++) {

                for (d = 0; d < cols; d++) {
                     sum[c][d] = arr1[c][d] + arr2[c][d];
                }
            }



            return sum;



        }
    }

