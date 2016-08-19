package com.javarush.test.level03.lesson06.task02;

/* Multiplication table
Write a program that displays the multiplication table 10 by 10 as follows:
    1 2 3 …
    2 4 6 …
    3 6 9 …
    …
*/

public class Solution
{
    public static void main(String[] args)
    {
        //add your code here
        int nGor[] = {1,2,3,4,5,6,7,8,9,10};
        for (int k = 1; k<11; k++){
                for (int i = 0; i<10; i++){
                System.out.print(nGor[i] * k + " ");
                }
        System.out.println();
    }
    }
}