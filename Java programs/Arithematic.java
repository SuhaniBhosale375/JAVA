// Entry point function
class Arithematic
{
     public static void main(String arr[])       
     {
          System.out.println("Inside main function");

          // Object of Maths class
          Maths mobj1 = new Maths();
          Maths mobj2 = new Maths(10,11);
          
          // perform Addition
          int iRet = 0;
          iRet = mobj1.Addition();
          System.out.println("Addition is : "+iRet);

          // Perform substraction
          iRet = mobj2.Substraction();
          System.out.println("Substraction is : "+iRet);

     }
}

// Class Defination
class Maths
{
     public int iNo1;    // Characteristics
     public int iNo2;    // Characteristics

     // Default constructor to initialize the value
     public Maths()      
     {
          System.out.println("Inside defult constructor");
          iNo1 = 0;
          iNo2 = 0;
     }

     // Parametrised constructor to initialize the value
     public Maths(int a, int b)    
     {
          System.out.println("Inside parametrised constructor");
          iNo1 = a;
          iNo2 = b;
     }

      // Behaviour for Addition
     public int Addition()   
     {
          int iAns = 0;
          iAns = iNo1 + iNo2;
          return iAns;
     }

     // Behaviour for Substraction
     public int Substraction()     
     {
          int iAns = 0;
          iAns = iNo1 - iNo2;
          return iAns;
     }
} // End of Maths class

