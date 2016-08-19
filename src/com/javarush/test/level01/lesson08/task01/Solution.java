package com.javarush.test.level01.lesson08.task01;

import java.lang.String;

/* Life is not fair
Write a program that displays 9 times: «Life is not fair - get used to it.».
*/
public class Solution
{
    public static void main(String[] args)
    {
        print9Times("Life is not fair - get used to it.");
    }

    public static void print9Times(String s)
    {
        for(int i = 0; i < 9; i++){
            System.out.println(s);
        }
    }
}
