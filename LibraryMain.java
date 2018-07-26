import java.util.*;
public class LibraryMain
{
    public static void main(String args[])
    {   int i;
        Scanner in=new Scanner(System.in);
        
        System.out.print("Total number of faculties:");
        int num_fac=in.nextInt();
        Faculty f[]=new Faculty[20];
        
        System.out.print("Total number of students :");
        int num_stu=in.nextInt();
        Student s[]=new Student[20];
        
        int num_mem=num_fac+num_stu;
                
        
        for(i=0;i<num_fac;i++)
        {
            f[i]=new Faculty();
            f[i].accept();
           // f[i].display();  
        }
        for(i=0;i<num_stu;i++)
        {
            s[i]=new Student();
            s[i].accept();
            //s[i].display();  
        }
        int c=1;
        while(c==1)
        {
            System.out.println("OPERATIONS");
            System.out.println("1.DISPLAY DETAILS  2.BORROW BOOK  3.RETURN BOOK  4.ADD STUDENT  5.ADD FACULTY");
            System.out.print("Enter your choice : ");
            int choice=in.nextInt();
            
            int indexf=-1,indexs=-1;
            if(choice== 1 ||choice==2 || choice ==3)
            {
               System.out.print("Library Membership ID : ");
               int ref=in.nextInt();
               //System.out.print("ref = "+ref);
               
               if(num_fac!=0)
               {
                   for(i=0;i<num_fac;i++)
                   {
                       if(f[i].id==ref)
                       {   //System.out.print("ref = "+ref+"; id = " +f[i].id);
                           indexf=i;
                    
                        }   
                    }
               }
               
               if(num_stu!=0)
               {
                    for(i=0;i<num_stu;i++)
                    { 
                        if(s[i].id==ref)
                        {
                            indexs=i;
                   
                        }
                    }
               }
                             //System.out.println("indexf = "+indexf +"; indexs = "+indexs);
            }
            
           
           if(choice==1)
           {
               
               if(indexf!=-1)
                  f[indexf].display();
               else if(indexs!=-1)
                  s[indexs].display();
               else
                  System.out.println("INVALID MEMBER ID");   
            }
            else if(choice==2)
            {
               
               if(indexf!=-1)
                  { f[indexf].books_taken=f[indexf].books_taken+1;
                    //f[indexf].display();
                  }
               else if(indexs!=-1)
                   {s[indexs].books_taken=s[indexs].books_taken+1; 
                     //s[indexs].display();
                    }
               else
                  System.out.println("INVALID MEMBER ID"); 
                   
            }
            else if(choice==3)
            {
               if(indexf!=-1)
                  f[indexf].books_taken=f[indexf].books_taken-1;
               if(indexs!=-1)
                  s[indexs].books_taken=s[indexs].books_taken-1;
                  else
                  System.out.println("INVALID MEMBER ID"); 
            }
            else if(choice==5)
            {
                f[num_fac]=new Faculty();
                f[num_fac].accept();
                //System.out.println("faculty id accepted ="+f[num_fac].id);
                System.out.println("");
                //f[num_fac].display();
                num_fac=num_fac+1;
            }
            
            else if(choice==4)
            {
                s[num_stu]=new Student();
                s[num_stu].accept();
                //System.out.println("Student id accepted ="+s[num_stu].id);
                System.out.println("");
                //s[num_stu].display();
                num_stu=num_stu+1;
            }
            System.out.println("");
            System.out.println("Total number of faculty  = " +num_fac );
            System.out.println("Total number of students = " +num_stu);
            System.out.println("Do you want to continue (Yes (1) /No (0) ) : ");
            c=in.nextInt();
        }
            
            
                
                
             
                        
                        
            
            
            
    }
        
    
}
