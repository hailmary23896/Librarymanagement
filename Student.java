import java.util.*;
public class Student extends Library
{
    int roll_no;
    String stream;
    Scanner in=new Scanner(System.in);  
    Scanner ins=new Scanner(System.in); 
    Student(){}
    
    void accept()
    {
        super.accept();
        System.out.print("Roll number : ");
        roll_no=in.nextInt();
        System.out.print("Stream : ");
        stream=ins.nextLine();
    }
    
    void display()
    {
        super.display();
        System.out.println("Roll number : "+roll_no);
        System.out.println("Stream : "+stream);
        System.out.println("");
    }
    
}
