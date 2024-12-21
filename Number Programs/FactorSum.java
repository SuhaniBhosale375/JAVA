import java.util.*;

class FactorSum
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enetr a number :");
        int iValue = sobj.nextInt();

        Numbers nobj = new Numbers();

        int iRet = nobj.SumOfFactors(iValue);

        System.out.print(iRet);
    }  
}

class Numbers
{
    int SumOfFactors(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= (iNo/2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {

                iSum = iSum + iCnt;
            }
        }

        return iSum;
    }
}