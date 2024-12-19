import java .util.*;



class Difference
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRet = 0;

        System.out.println("Enter any number :");
        int No = sobj.nextInt();

        Numbers nobj = new Numbers();

        iRet = nobj.SumDifference(No);

        System.out.println("Difference is :"+iRet);

    }
}
class Numbers
{
    int SumDifference(int Num)
{
    int Fact_Sum = 0,Non_Fact_Sum = 0;

    for(int i = 1; i < Num; i++)
    {
        if(Num % i == 0)
        {
          Fact_Sum = Fact_Sum + i;
        }
        if(Num % i != 0)
        {
            Non_Fact_Sum = Non_Fact_Sum + i;
        }
    }

    return (Non_Fact_Sum - Fact_Sum);

}
}

