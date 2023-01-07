public class Commandline
{
  public static void main(String args[])
  {
    int sum,dif,prod,quo,rem;
    int a=Integer.parseInt (args[0]);
    int b=Integer.parseInt (args[1]);
    sum=a+b;
    dif=a-b;
    prod=a*b;
    quo=a/b;
    rem=a%b;
    System.out.println("Sum="+sum);
    System.out.println("difference="+dif);
    System.out.println("product="+prod);
    System.out.println("quotient="+quo);
    System.out.println("remainder="+rem);
  }
}