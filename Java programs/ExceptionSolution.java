import java.util.*;

class ExceptionSolution
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0,iNo2 = 0,iAns = 0;

        System.out.println("Enter first number");
        iNo1 = sobj.nextInt();

        System.out.println("Enter second number");
        iNo2 = sobj.nextInt();
       
        try
        {
            System.out.println("Inside the try block");
             iAns = iNo1 / iNo2;
            System.out.println("Division is :"+iAns);

        }

        catch(ArithmeticException obj)
        {
            System.out.println("Insede the catch 1");
            System.out.println(obj);
        }

        catch(NullPointerException obj)
        {
            System.out.println("Insede the catch 2");
            System.out.println(obj);
        }
        catch(Exception obj)
        {
            System.out.println("Insede the catch 3");
            System.out.println(obj);
        }
        finally
        {
            System.out.println("Inside the finally block");
            sobj.close();
        }
    }
}