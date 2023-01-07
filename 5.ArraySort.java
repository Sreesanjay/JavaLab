import java.util.*;
public class Demo
 {
   public static void main(String []args)
{
     
 int arr[];
arr=new int[10];
Scanner sc=new Scanner(System.in);
System.out.println("enter elements:");
for(int i=0;i<10;i++)
{
arr[i]=sc.nextInt();
}
      System.out.println("Array = "+Arrays.toString(arr));
      Arrays.sort(arr);
      System.out.println("Sorted Array = "+Arrays.toString(arr));
      System.out.println("Smallest element = "+arr[0]);
      System.out.println("Largest element = "+arr[9]);
      System.out.println("2nd Largest element = "+arr[8]);
   }
}