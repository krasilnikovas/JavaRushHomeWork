package com.javarush.test.level03.lesson04.task04;

/* The product of 10 numbers
Write a program that displays the product of numbers from 1 to 10.
    Hint: it’s three million and a little more
*/

public class Solution
{
    public static void main(String[] args)
    {
        //add your code here
        int a = 1;
        for (int i = 1; i <= 10; i++) {
            a = a * i;
        }
        System.out.println(a);
    }
}