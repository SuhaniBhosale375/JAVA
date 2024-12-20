import java.util.*;

class FibonaciiSeries
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enetr a number :");
        int iValue = sobj.nextInt();

        Numbers nobj = new Numbers();

        nobj.Fibonacii(iValue);
    }  
}

class Numbers
{
    int No1 = 0, No2 = 1, No3 = 0;
    
    void Fibonacii(int iNo)
    {
        System.out.print(No1);
        System.out.print(No2);

        while(iNo > No3)
        {
            No3 = No1 + No2;

            System.out.print(No3);

            No1 = No2;
            No2 = No3;

            iNo--;
        }
    }
}