import java.util.*;

class EvenFactors
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a value :");
        int iValue = sobj.nextInt();

        Numbers nobj = new Numbers();

        nobj.DisplayEvenFactors(iValue);
    }
}

class Numbers
{
    void DisplayEvenFactors(int iNo)
    {
        for(int iCnt = 1; iCnt <= (iNo/2); iCnt++)
        {
            if((iNo % iCnt == 0) && (iCnt % 2) == 0)
            {
                System.out.println(iCnt+"\t");
            }
        }
    }
}