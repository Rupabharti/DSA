import java.util.*;
class Armstrong
{
public static void main(String arg[])
{
int n=153;
int d=n;
int p=0;

  while(n>0)
{
int N=n%10;
p=N*N*N+p;
n=n/10;
}
if(p==d)
 System.out.println("Aremstrong number" +d);
else 
System.out.println("not Armstrong" +p);
}
}