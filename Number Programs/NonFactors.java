import java.util.*;

// O(N/2)
class NonFactors
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enetr a number :");
        int iValue = sobj.nextInt();

        Numbers nobj = new Numbers();

        nobj.DisplayNonFactors(iValue);
    }
}
class Numbers
{
    void DisplayNonFactors(int iNo)
    {
        System.out.println("Non Factors of "+iNo);

        for(int iCnt = 1; iCnt <= (iNo/2); iCnt++)
        {
            if((iNo % iCnt) != 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}
