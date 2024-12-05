class Arithmatic
{
    public int iNo1;
    public int iNo2;

    public Arithmatic()
    {
        System.out.println("Inside the default constructor  ");
        iNo1 = 0;
        iNo2 = 0;
    }
    public Arithmatic(int x,int y)
    {
        System.out.println("Inside the Parameterised constructor ");
        iNo1 = x;
        iNo2 = y;
    }

    public int Div()
    {
        System.out.println("Inside the Div function ");
        int iRet = 0;
        iRet = iNo1/iNo2;
        return iRet;
    }
}
class Divide
{
    public static void main(String arr[])
    {
        System.out.println("Inside the main ");

        Arithmatic Obj = new Arithmatic(12,3);

        int iDiv = 0;

        iDiv = Obj.Div();
        System.out.println("Division is :"+iDiv);
    }
}