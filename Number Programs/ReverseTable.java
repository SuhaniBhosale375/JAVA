import java.util.*;

// O(N/2)
class ReverseTable
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enetr a number :");
        int iValue = sobj.nextInt();

        Numbers nobj = new Numbers();

        nobj.DisplayReverse(iValue);
    }
}
class Numbers
{
    void DisplayReverse(int iNo)
    {
        for(int i = 10; i >  0; i-- )
        {
            System.out.println(iNo*i);
        }
    }
}
