package org.example;
import java.util.Scanner;


/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        String truePass = "abc$123";

        System.out.println( "What is the username?" );
        String user= sc.nextLine();

        System.out.println( "What is the password?" );
        String password = sc.nextLine();



        if( password.contains(truePass))
        {
            System.out.println( "Welcome!" );
        }
        else
        {
            System.out.println( "I don't know you." );
        }

    }
}
