import java.util.*;
class Prime
{
public static void main(String arg[])
{
  System.out.println("enter a number");
  Scanner sc= new Scanner(System.in);
  int n= sc.nextInt();
   int count=0;
    for(int i=1;i<=n;i++)
   {
     if(n%i==0)
      count= count+1;
   }
    if(count==2)
     System.out.println("number is prime");
    else 
System.out.println("not prime ");
}
}