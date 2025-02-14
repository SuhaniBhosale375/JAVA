/*
Task3 :
Given an integer, , perform the following conditional actions:

If  number is odd, print Weird
If number is even and in the inclusive range of 2 to 5, print Not Weird
If number is even and in the inclusive range of 6 to 20, print Weird
If number is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not number is weird.

*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class if_elseif_Satement
{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
    {
        int N = scanner.nextInt();
        
        if((N % 2) != 0)
        {
            System.out.println("Weird");
        }
        else if((N % 2 == 0) &&((N >= 2) && (N <= 5)))
        {
            System.out.println("Not Weird");
        }
        else if((N % 2 == 0) &&((N >= 6) && (N <= 20)))
        {
            System.out.println("Weird");
        }
        else if((N % 2 == 0) &&(N >= 20))
        {
            System.out.println("Not Weird");
        } 

        scanner.close();
    }
}
