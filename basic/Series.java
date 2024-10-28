import java.util.*;
class Series
{
public static void main(String arg[])
{
 int a=2,b=1,c=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of trem");
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
 System.out.println(c);
 c=a+b;
 a=b;
 b=c;


}
}
}