import java.util.*;
class Stringchek
{
public static void main(String arg[])
{
 System.out.println(" enter a string");
  Scanner sc=new Scanner(System.in);
 String s=sc.nextLine();
 System.out.println(s);
 for(int i=s.length()-1;i>=0;i--)
{
    System.out.print(s.charAt(i));
}

}
}