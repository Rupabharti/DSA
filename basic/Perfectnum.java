import java.util.*;
class Perfectnum
{
public static void main(String arg[])
{  Scanner sc=new Scanner(System.in);
   System.out.println("enter a number");
   int n=sc.nextInt();
   cheknum(n);

}
public static void cheknum(int n)
{
   int s=0;
  for(int i=1;i<=n/2;i++)
{
   if(n%i==0){
   s=s+i;
}
}
if(s==n)
System.out.println(" Perfect number"+n);
else
System.out.println(" not perfect number");

}
}