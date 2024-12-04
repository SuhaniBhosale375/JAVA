import java.util.*;

class Multiplication
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

        iAns = aobj.Mult(iNo1,iNo2);

        System.out.println("Multiplication is :"+iAns);

    }
}
class Arithematic
{
    public int Mult(int i,int j)
    {
        int iMult = 0;
        iMult = i * j;
        return iMult;
    }
}