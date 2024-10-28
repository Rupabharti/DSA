import java.util.*; 
class Triangle{
public static int findarea(int a, int b)
{
return (a*b)/2;
}


public static void main(String arg[])
{ 
 int a,b,r;
 Scanner sc= new Scanner(System.in);
System.out.println(" enter length and breath");
a=sc.nextInt();
b=sc.nextInt();
r=findarea(a,b);
System.out.println(" Area is "+r);

}

}