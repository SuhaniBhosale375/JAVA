import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = 1;
        
        while(scan.hasNextLine())
        {
                String s = scan.nextLine();
                System.out.println(n+" "+s);
                n++;
        }
        
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        scan.close();
        
    }
}
