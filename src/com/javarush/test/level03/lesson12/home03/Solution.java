package com.javarush.test.level03.lesson12.home03;

/* I will earn $50 per hour
Write a program that reads from keyboard a number n and displays «I will earn $n per hour».

    Example:
    I will earn $50 per hour
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String amount = reader.readLine();
        System.out.print(" I will earn $" + amount + " per hour");
    }
}