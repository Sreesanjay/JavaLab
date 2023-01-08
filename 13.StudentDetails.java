import java.util.*;
class Student
{
   Scanner sc=new Scanner(System.in);
   int RegNo,Total=0,subjects;
   String name;
   int marks[];
   void StudentDetails()
   {
      System.out.print("Enter Registration No.: ");
      RegNo=sc.nextInt();
      System.out.print("Enter Student Name: ");
      name=sc.next();;
   }
}
class Marks extends Student{
   void getDisMarks()
   {
       marks=new int[3];
       System.out.print("Enter marks of Physics: ");
       marks[0]=sc.nextInt();
       System.out.print("Enter marks of Chemistry: ");
       marks[1]=sc.nextInt();
       System.out.print("Enter marks of Maths: ");
       marks[2]=sc.nextInt();
       for(int i=0;i<3;i++)
       {
          Total+=marks[i];
       }
   }
}
class StudentDemo extends Marks
{
    public static void main(String args[])
    {
       Student s=new Student();
       Marks m=new Marks();
       s.StudentDetails();
       m.getDisMarks();
       System.out.println("Name : "+s.name);
       System.out.println("Reg No : "+s.RegNo);
       System.out.println("Marks in Physics : "+m.marks[0]);
       System.out.println("Marks in Chemistry : "+m.marks[1]);
       System.out.println("Marks in Maths : "+m.marks[2]);
       System.out.println("total Marks : "+m.Total);
       System.out.println("Average Marks : "+m.Total/5);
     }
}
