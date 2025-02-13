/*
Task4 :
Input Format

There are three lines of input:

The first line contains an integer.
The second line contains a double.
The third line contains a String.
Output Format

There are three lines of output:

On the first line, print String: followed by the unaltered String read from stdin.
On the second line, print Double: followed by the unaltered double read from stdin.
On the third line, print Int: followed by the unaltered integer read from stdin.


*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import java.util.Scanner;

public class Datatype 
{

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a integer :");
        int i = scan.nextInt();

        System.out.println("Enter a decimal number :");
        double d = scan.nextDouble();

        scan.nextLine();

        System.out.println("Enter String :");
        String s = scan.nextLine();
        
        System.out.println("String: " +s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}