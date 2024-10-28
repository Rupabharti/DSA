import java.util.*;
class Slection_sort
{
public static void Sort(int a[])
{
   for(int i=0;i<a.length;i++){
    int min=i;
     for(int j=i+1;j<a.length;j++)
     {
       if(a[min]>a[j])
            min=j; 
     } 
   int temp= a[min];
   a[min]=a[i];
    a[i]=temp;
    }
  System.out.println(" array  after sorting ");
  for(int i=0;i<a.length;i++)
   {
     System.out.print(a[i]+",");
}
}
 




public static void main(String arg[])
{
 int a[]={3,2,7,5,8,10,4};
  System.out.println(" array befor sorting ");
  for(int i=0;i<=a.length-1;i++)
   {
     System.out.print(a[i]+",");
}
   Sort(a);
}
}