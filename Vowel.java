//exp3.4
import java.util.*;
public class Vowel{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String:");
        String str = in.nextLine().toLowerCase();
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
            {
                count++;
            }
        }
        System.out.println("The number of vowels: " + count);
    }
}