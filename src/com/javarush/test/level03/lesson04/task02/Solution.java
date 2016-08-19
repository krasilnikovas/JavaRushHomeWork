package com.javarush.test.level03.lesson04.task02;

/* My name
Write a program that displays your name on 5 rows. Each row should contain 10 words (your name) separated by a space.
*/

public class Solution
{
    public static void main(String[] args)
    {
        print10("test");
    }

    public static void print10(String s){
        for(int i = 0; i < 10; i++, System.out.println("")){
            for(int k = 0; k < 10; k++){
                System.out.print(s + " ");
            }
        }
    }
}