import java.util.*;

class CheckOccurence
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array :");
        int iSize = sobj.nextInt();

        System.out.println("Enter the that we want to find the frequency :");
        int No = sobj.nextInt();

        Maths mobj = new Maths(iSize,No);

        mobj.Accept();
        mobj.Display();
        boolean bRet = mobj.Occurence();

        if(bRet == true)
        {
            System.out.println("Element is occured in the array");
        }
        else
        {
            System.out.println("Element is not occured in the array");
        }

    }
}

class Maths
{
    public int Arr[];
    int No = 0;

    public Maths(int iSize,int i)
    {
        Arr = new int[iSize];
        No = i;
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements of the array that we want to perform the operation:");

        for(int i = 0; i < Arr.length; i++)
        {
            System.out.println("Enter elements no :"+(i+1));
            Arr[i] = sobj.nextInt();
        }       

    }

    public void Display()
    {
        System.out.println("Array Elements are :");

        for(int i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]+"\t");
        }
    }
    public boolean Occurence()
    {
        boolean flag = false;

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == No)
            {
                flag = true;
                break;
            }
           
        }

        return flag;

    }
}
