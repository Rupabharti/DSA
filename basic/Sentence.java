import java.util.*;
class Sentence
{
public static void main(String arg[])
{
String s1="Rupa.bharti.kumari.supergirl";
String []s2=s1.split("\\.");
for(int i=0;i<=s2.length-1;i++)
{
System.out.print(s2[i]);
}

for(int i=s2.length-1;i>=0;i--)
{
System.out.print(s2[i]);
if(i>0)
 System.out.print(".");
}
}
}




class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // code here
        String[] words = str.split("\\.");
        
        // Use a StringBuilder to build the result
        StringBuilder result = new StringBuilder();
        
        // Loop through the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) {
                result.append(".");  // Add '.' between words
            }
        }
        
        // Return the result as a string
        return result.toString();
    
      
        
        
    }
}