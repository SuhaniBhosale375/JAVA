import java.util.*;

class Swapping
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enetr first number :");
        int iValue1 = sobj.nextInt();

        System.out.println("Enetr second number :");
        int iValue2 = sobj.nextInt();

        Numbers nobj = new Numbers();

       nobj.SwapNumbers(iValue1,iValue2);
    }  
}

class Numbers
{
    void SwapNumbers(int iNo1,int iNo2)
    {
        iNo1 = iNo1 + iNo2;
        iNo2 = iNo1 - iNo2;
        iNo1 = iNo1 - iNo2;
        
        System.out.println("After Swapping\n");
        
        System.out.println("Value of No1:"+iNo1);
        System.out.println("Value of No2:"+iNo2);

        
    }
}