import java.util.*;

class CheckPerfect
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet = false;

        System.out.println("Enter a Number :");
        int iValue = sobj.nextInt();

        Numbers nobj = new Numbers();

        bRet =  nobj.Perfect_Or_Not(iValue);

        if(bRet == true)
        {
            System.out.println(iValue+" is a perfect number ");
        }
        else
        {
            System.out.println(iValue+" is not a perfect number ");
        }
    }
}
class Numbers
{
    boolean Perfect_Or_Not(int iNo)
    {
        int iSum = 0;

        for(int iCnt = 1; iCnt <= (iNo/2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {

                iSum = iSum + iCnt;
            }
        }
        
        if(iSum == iNo)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}

