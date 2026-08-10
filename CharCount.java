//exp3.5
import java.util.*;
public class CharCount{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String:");
        String str = in.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            {
                count++;
            }
        }
        System.out.println("The number of characters: " + count);
    }
}