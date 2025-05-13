class FinalizeDemo
{
    public static void main(String s[])
    {
        Demo obj = new Demo(4);
        obj = null;
        System.gc(); 
    }
}

class Demo
{
    int iSize;
    int Arr[];

    public Demo(int No)
    {
        System.out.println("Inside Constructor");
        iSize = No; 
        Arr = new int[iSize];
    }
    
    protected void finalize()
    {
        System.out.println("Inside the finalize method");
        Arr = null;
    }
}