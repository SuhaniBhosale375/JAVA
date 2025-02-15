import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Table_OutPut_Format
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a positive number :");

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(N+ " x "+i+" = "+N*i);
        }

        bufferedReader.close();
    }
}
