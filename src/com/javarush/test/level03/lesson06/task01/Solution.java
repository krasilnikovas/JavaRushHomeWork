package com.javarush.test.level03.lesson06.task01;

/* Stop look listen
Write a program that displays all possible combinations of words «Stop», «Look», «Listen».
    Hint: there are 6 variants. Display each combination in a new line. Do not separate words.

    Example:
    LookListenStop
    ListenStopLook
    ...
*/

public class Solution
{
    public static void main(String[] args)
    {
        //add your code here
        String[] a = new String[3];
        a[0] = "Stop";
        a[1] = "Look";
        a[2] = "Listen";
        for (int i=0;i<=2;i++){
            for (int j=0;j<=2;j++){
                for (int k=0;k<=2;k++){
                    if ( (i!=j)&&(i!=k)&&(j!=k)){
                        System.out.println(a[i]+a[j]+a[k]);
                    }
                }
            }
        }
    }
}