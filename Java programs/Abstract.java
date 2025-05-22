// abstract class is a class which contains 0 or more abstract method int it
class Abstract
{
    public static void main(String arr[])
    {
        Demo dobj = new Demo();

        int Ret = 0;
        Ret = dobj.Addition(11,10);
        System.out.println("Addition is :"+Ret);

        Ret = dobj.Substraction(11,10);
        System.out.println("Substraction is :"+Ret);
    }
}
abstract class Arithematic
{
    public int Addition(int No1,int No2)
    {
        return No1+No2;
    }
    public abstract int Substraction(int No1,int No2);
    // virtual int Substraction(int No1,int No2) = 0;
}

class Demo extends Arithematic
{
    public int Substraction(int No1,int No2)
    {
        return No1 - No2;
    }

}
