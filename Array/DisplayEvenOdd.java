import java.util.*;

class OddCount
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array :");
        int iSize = sobj.nextInt();

        Maths mobj = new Maths(iSize);

        mobj.Accept();
        mobj.Display();
        mobj.DisplayEvenOdd();

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
    
    public void DisplayEvenOdd()
    {
        int E_Cnt = 0,O_Cnt = 0;

        for(int i = 0; i < Arr.length;i++)
        {
            if(Arr[i] % 2 == 0)
            {
                E_Cnt++;
            }

            if(Arr[i] % 2 != 0)
            {
               O_Cnt++;
            }
        }


        System.out.println("Count of even elements is :"+E_Cnt);
        System.out.println("Count of odd elements is :"+O_Cnt);
    }
}
