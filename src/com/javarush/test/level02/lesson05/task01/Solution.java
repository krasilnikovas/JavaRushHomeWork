package com.javarush.test.level02.lesson05.task01;

/* Many people are alive
Write a program that displays 3 times: «Many people are alive only because it's illegal to shoot them.».
*/
public class Solution
{
    public static void main(String[] args)
    {
        print9Times("Many people are alive only because it's illegal to shoot them.");
    }
    public static void print9Times(String s)
    {
        for(int i = 0; i < 3; i++){
            System.out.println(s);
        }
    }
}
