import java.util.*;

class Collections2
{
    public static void main(String arg[])
    {
        LinkedList <Book> lobj = new LinkedList<Book>();

        lobj.add(new Book("Let us C",400));     //Anonymus object
        lobj.add(new Book("Data structure",580));
        lobj.add(new Book("C++ Programming",979));
        lobj.add(new Book("Angular web developement",790));

        Iterator iobj = lobj.iterator();
        Book bref = null;

        while(iobj.hasNext())
        {
            bref = (Book)iobj.next();
            bref.Display();
        }

        lobj.clear();
    }
}
class Book
{
    public String Name;
    public int Price;

    public Book(String s, int i)
    {
        this.Name = s;
        this.Price = i;
    }
    public void Display()
    {
        System.out.println("Book name :"+this.Name +"   Price : "+this.Price);
    }
}

