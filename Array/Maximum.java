import java.util.*;

class Maximum
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array :");
        int iSize = sobj.nextInt();

        Maths mobj = new Maths(iSize);

        mobj.Accept();
        mobj.Display();
        int iRet = mobj.Find_Max();

        System.out.println("Maximun element is : "+iRet);

    }
}

class Maths
{
    public int Arr[];

    public Maths(int iSize)
    {
        Arr = new int[iSize];
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
    public int Find_Max()
    {
        int Max = Arr[0];

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] > Max)
            {
                Max = Arr[i];
            }
            
        }

        return Max;
    }
}
