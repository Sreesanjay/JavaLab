import java.util.*;
class Employee
{
    int id;
    
    String name,dep,des;
    
    void readEmployee(Scanner sc)
    {
       
        System.out.println("enter the name of employee");
        name=sc.next();
        System.out.println("enter employee id");
        id=sc.nextInt();
        System.out.println("enter Designation");
        des=sc.next();
        System.out.println("enter Department");
        dep=sc.next();
     
    }
    void show()
    { 
        System.out.println("--------------------------");
        System.out.println("Name              "+name);
        System.out.println("EmpID             "+id);
        System.out.println("Designation       "+des);
        System.out.println("Dept              "+dep);
      
        System.out.println("--------------------------");
    }
   

}


class Salary extends Employee
{
int sal;
double da,hra,pf,ns=0.00,al;


void readSalary(Scanner sc)
{
      System.out.println("enter the basic salary");
        sal=sc.nextInt();

}

 void netsalary()
    {
        da=sal*1.1;
        hra=1250;
        pf=sal*.12;
        al=sal*.35;
        ns=sal+hra+da+al-pf;
        
    }  
  
void display()
{
	 System.out.println("Net salary              "+ns);
}


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Employee e=new Employee();
        e.readEmployee(sc);
        Salary s=new Salary();
        s.readSalary(sc);
        System.out.println("employee details");
        s.netsalary();
        e.show();
	  s.display();
	
    }
}
