/*import java.util.*;
class Numbercount
{
public static void main(String arg[])
{
int count=0;
System.out.println("enter a number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
while(n>0)
{
 n=n/10;
 count++;
System.out.println("number of degit is :-  "+count);

}

}
}*/
//optimal solution

import java.util.*;
class Numbercount
{
public static void main(String arg[])
{
System.out.println("enter a number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

int count=(int)(Math.log10(n)+1);

System.out.println("number of degit is :-  "+count);
}

}
}