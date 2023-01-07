import java.util.Scanner;
import java.lang.Math;
class isArmstrong
{
	boolean checkArmstrong(int num) {
		int temp,count=0;
	    int digit,sum=0;
		
		temp=num;
		
		while(temp!=0)
		{
			temp=temp/10;
			count++;
		}
		
		
		temp=num;
		
		while(temp>0)
		{
			digit=temp%10;
			
		    sum+=(Math.pow(sum,digit));
			temp=temp/10;
			
			
		}
		
		if(num==sum)
		{
			System.out.print(num);
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
}




class Armstrong
{

	public static void main(String[] args)
	{
		
		int i,st_limit,en_limit;
		
		Scanner sc=new Scanner(System.in);
		isArmstrong a=new isArmstrong();
		
		System.out.print("Enter the starting number of range");
		st_limit=sc.nextInt();
		System.out.print("Enter the ending number of range");
		en_limit=sc.nextInt();
		
		System.out.println("Armstrong number between "+st_limit+" and "+en_limit+" is:");
		for(i=st_limit;i<=en_limit;i++)
		{
			if(a.checkArmstrong(i))
			{
				System.out.print(i+",");
			}
		}
 		
	}

}
