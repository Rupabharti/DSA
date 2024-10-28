import java.util.*;
class Diviser
{
public static void main(String arg[])
{
 System.out.println(" enter a number");
 Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
if(n%i==0)
 System.out.println( i);
else
continue;
} 

}
}