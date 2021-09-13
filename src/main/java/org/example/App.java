/*
 *  UCF COP3330 Fall 2021 Assignment 22 Solution
 *  Copyright 2021 Andrew Howard
 */
package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int num1, num2, num3;
        Scanner keyboardInput =  new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = keyboardInput.nextInt();

        System.out.print("Enter the second number: ");
        num2 = keyboardInput.nextInt();

        System.out.print("Enter the third number: ");
        num3 = keyboardInput.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.print("The largest number is: " + num1);
        }
        else if ((num2 > num1) && (num2 > num3))
        {
            System.out.print("The largest number is " + num2);
        }
        else if ((num3 > num1) && (num3 > num2))
        {
            System.out.print("The largest number is " + num3);
        }
        else { System.out.print("Enter different values ");}


    }
}
