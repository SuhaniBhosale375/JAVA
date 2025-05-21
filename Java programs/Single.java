class Single
{
    public static void main(String arr[])
    {
        //  Base bobj1 = new Base();           // No Casting
       Derived dobj1 = new Derived();     // No Casting
       //c   Base bobj2 = new Derived();         // Upcasting
       // Derived dobj2 = new Base();         // Downcasting
    }
}

class Base
{
    public int A,B;
    
    public Base()
    {
        System.out.println("Base constructor");
        this.A = 10;
        this.B = 20;
       
    }
     public void fun()
    {
        System.out.println("Inside the Base fun"); 
    }
    public void gun()
    {
        System.out.println("Inside the Base gun"); 
    }
    public void fun(int No)
    {
        System.out.println("Inside the Base fun with one integer"); 
    }
}

class Derived extends Base          // class Derived : public Base
{
    public int X,Y; 

    public Derived()
    {
        System.out.println("Derived constructor");

        this.X = 30;
        this.Y = 40;
    }

    public void sun()
    {
        System.out.println("Inside Derived sun");
    }
    public void gun()
    {
        System.out.println("Inside Derived gun");
    }
}
