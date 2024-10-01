class Interface
{
    public static void main(String arr[])
    {
        System.out.println("Value of PI is : "+Circle.PI );     // To demonstrate public and static 
        //Circle.PI = 7.12f;            // To demonstrate final

        Circle cobj = new Demo();
        float Ret = 0.0f;
        Ret = cobj.Area(10.5f);
        System.out.println("Area is :"+Ret);
        Ret = cobj.Circumference(10.5f);
        System.out.println("Circumference is :"+Ret);

    }
}
interface Circle
{
    float PI = 3.14f;       // public static final float PI = 3.14f;

    float Area(float Radius);      // public abstract float Area(float Radius)
    float Circumference(float Radius);  // public abstract float Circumference(float Radius)
}

class Demo implements Circle
{
    public float Area(float Radius)
    {
        return PI * Radius * Radius;
    }
    public float Circumference(float Radius)
    {
        return 2 * PI * Radius;
    }
}
