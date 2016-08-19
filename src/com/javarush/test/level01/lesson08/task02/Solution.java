package com.javarush.test.level01.lesson08.task02;

/* Stakeholder in your life
Write a program that displays 4 times: «The most important stakeholder in your life is You.».
*/
public class Solution
{
    public static void main(String[] args)
    {
        print9Times("The most important stakeholder in your life is You.");
    }

    public static void print9Times(String s)
    {
        for(int i = 0; i < 4; i++){
            System.out.println(s);
        }
    }
}
