
import java.util.Scanner;

public class 
{
    public static void main(String args[])
    {
        Scanner Scan = new Scanner(System.in);
        
        String s1 = Scan.next();
        int a = Scan.nextInt();
        
        Scan.nextLine();
        
        String s2 = Scan.next();
        int b = Scan.nextInt();
        
        Scan.nextLine();
        
        String s3 = Scan.next();
        int c = Scan.nextInt();
        
        
        Scan .close();
        System.out.println("================================");
        System.out.printf("%-15s%03d%n",s1,a);
        System.out.printf("%-15s%03d%n",s2,b);
        System.out.printf("%-15s%03d%n",s3,c);
        System.out.println("================================");
        
        
        
    }
}
