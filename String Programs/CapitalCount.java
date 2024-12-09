import java.util.*;

class CapitalCount
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
       
        System.out.println("Please enter String:");
        String str = sobj.nextLine();

        StringX obj = new StringX();
        int iRet = obj.CapCount(str);

        System.out.println("Number of capital case letters are :"+iRet);
       
    }
}

class StringX
{
    public int CapCount(String s)
    {
        int iCnt = 0;
        char Arr[] = s.toCharArray();

        for(int i = 0; i <s.length(); i++)
        {
            if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
            {
                iCnt++;
            }
        }
        return iCnt;

    }
}
