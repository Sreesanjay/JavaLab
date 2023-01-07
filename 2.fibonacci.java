import java.util.Scanner;

public class FIb
{
	
	public static void main(String args[])
	{
		int i,fib1=0,fib2=1,fib3,limit;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the limit to display:");
		limit=sc.nextInt();
		System.out.println("The fibonacci series upto "+limit+" is");
		
		for(i=1;i<=limit;i++)
		{
			System.out.println(i+":"+fib1);
			fib3 = fib1 + fib2;
		    fib1 = fib2;
		    fib2 = fib3;
		}
		
		
	}
}
