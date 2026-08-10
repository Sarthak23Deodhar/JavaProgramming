//exp3.2
import java.util.*;
public class StringPalin{
    public static void main(String args[])
    {
        System.out.println("Enter a string:");
        Scanner scanner =new Scanner(System.in);
        String string = scanner.nextLine();
        String pal ="";
        for(int i=string.length()-1;i>=0;i--)
        {
            pal = pal + string.charAt(i);
        }
        if(string.equals(pal))
        {
            System.out.println("string is a palindrome");
        }
        else
        {
            System.out.println("string is not a palindrome");
        }

    }
}