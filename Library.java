import java.util.*;
class Library
{
    public int id;
    public String name;
    public String address ;
    public long phone;
    public int books_taken;
    Scanner in=new Scanner(System.in);
    Scanner ins=new Scanner(System.in);
    Library(){}
    
    void accept()
    {
        System.out.println("");
        System.out.print("Name : ");
        name=ins.nextLine();
        System.out.print("Library Membership Id : ");
        id=in.nextInt();
        System.out.print("Address : ");
        address=ins.nextLine();
        System.out.print("Phone Number : ");
        phone=in.nextLong();
        System.out.print("Total number of books taken : ");
        books_taken=in.nextInt();
        
    }
    
    void display()
    {
        System.out.println("");
        System.out.println("Library Membership Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
        System.out.println("Phone Number : "+phone);
        System.out.println("Total number of books taken : "+books_taken);
    }    
}
