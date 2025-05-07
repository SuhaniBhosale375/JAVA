package User;

public class Math
{
    public int iValue1;
    public int iValue2;

    // Constructor to initialize values
    public Math(int A, int B) 
    {
        iValue1 = A;
        iValue2 = B;
    }

    // Method for addition
    public int Addition() 
    {
        return iValue1 + iValue2;
    }

    // Method for subtraction
    public int Subtraction() 
    {
        return iValue1 - iValue2;
    }
}
