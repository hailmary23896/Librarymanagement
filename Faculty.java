import java.util.*;
public class Faculty extends Library
{
    int faculty_id;
    String designation;
    Scanner in=new Scanner(System.in); 
    Scanner ins=new Scanner(System.in); 
    Faculty(){}
    
    void accept()
    {
        super.accept();
        System.out.print("faculty_id : ");
        faculty_id=in.nextInt();
        System.out.print("designation : ");
        designation=ins.nextLine();
    }
    
    void display()
    {
        super.display();
        System.out.println("faculty_id : "+faculty_id);
        System.out.println("designation : "+designation);
        System.out.println("");
    }
}
