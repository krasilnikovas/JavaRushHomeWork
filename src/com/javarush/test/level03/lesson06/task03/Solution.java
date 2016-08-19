package com.javarush.test.level03.lesson06.task03;

/* Seven colors of the rainbow
Write a program that displays seven colors of the rainbow.
    Two lines must have three colors. The third one must have just one color.
    Separate the colors in the lines by spaces.
*/

public class Solution
{
    public static void main(String[] args)
    {
        String a = "Red";
        String b = "Orange";
        String c = "Yellow";
        String d = "Green";
        String e = "Blue";
        String f = "Indigo";
        String g = "Violet";
        System.out.println(a + " " + b + " " + c);
        System.out.println(d+" "+e+" "+f);
        System.out.println(g);
    }

}