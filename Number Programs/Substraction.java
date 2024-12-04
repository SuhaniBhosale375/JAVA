import java.util.*;


class Substraction
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0, iNo2 = 0,iAns = 0;

        System.out.println("Enter first number: ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter second number: ");
        iNo2 = sobj.nextInt();

        Arithematic aobj = new Arithematic();

        iAns = aobj.Sub(iNo1,iNo2);

        System.out.println("Substraction is :"+iAns);

    }
}
class Arithematic
{
    public int Sub(int i,int j)
    {
        int iSub = 0;
        iSub = i - j;
        return iSub;
    }
}