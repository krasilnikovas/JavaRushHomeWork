package com.javarush.test.level02.lesson08.task02;

/* Maximum of two numbers
Write a function that returns a maximum of two numbers.
*/
public class Solution
{
    public static int max(int a, int b)
    {
        if (a<b){
           return b;
        }
        else {
            return a;
        }
    }

    public static void main(String[] args) throws Exception
    {
        System.out.println( max(10,20) );
        System.out.println( max(-10,-20) );
        System.out.println( max(-100,0) );
    }

}