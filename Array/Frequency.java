import java.util.*;

class Addition
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
        int iRet = mobj.Frequency();

        System.out.println("Freqiency of given number is : "+iRet);

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
    public int Frequency()
    {
        int Freq = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == No)
            {
                Freq++;
            }
        }

        return Freq;
    }
}
