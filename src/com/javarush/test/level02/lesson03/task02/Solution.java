package com.javarush.test.level02.lesson03.task02;

/* Do the impossible
Write a program that displays 7 times: «It's kind of fun to do the impossible.».
*/
public class Solution
{
    public static void main(String[] args)
    {
        print9Times("It's kind of fun to do the impossible.");
    }
    public static void print9Times(String s)
    {
        for(int i = 0; i < 7; i++){
            System.out.println(s);
        }
    }
}
