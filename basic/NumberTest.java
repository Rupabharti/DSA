import java.util.*;
class NumberTest
{
public static void main(String arg[])
{
  System.out.println(" enter number for test");
   Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
 numberchek(n);
}
public static void numberchek(int n)
{
int s=0;
 int t=n%10;
  n=n/10;
 for(  ;n>0;n=n/10)
{
 int r=n%10;
s=s+r;
}
 if(t==s)
  System.out.println(" number is decula"+n);
else
 System.out.println(" number is not decula"+n);

}
}