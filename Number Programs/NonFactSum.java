import java.util.*;

class NonFactSum
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enetr a number :");
        int iValue = sobj.nextInt();

        Numbers nobj = new Numbers();

        int iRet = nobj.SumOfNonFactors(iValue);

        System.out.print("Summation of non factor is "+iRet);
    }  
}

class Numbers
{
    int SumOfNonFactors(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= (iNo/2); iCnt++)
        {
            if((iNo % iCnt) != 0)
            {

                iSum = iSum + iCnt;
            }
        }

        return iSum;
    }
}