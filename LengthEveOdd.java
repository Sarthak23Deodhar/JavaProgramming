//exp3.6
import java.util.*;
public class LengthEveOdd{
    public static void main (String args[])
    {
        System.out.print("Enter the String:");
        Scanner in = new Scanner(System.in);
        String str= in.nextLine();
        int len = str.length();
        if(len%2==0)
            System.out.println("The length of the string is even");
        else
            System.out.println("The length of the string is odd");
        
    }
}