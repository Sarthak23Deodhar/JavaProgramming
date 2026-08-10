//exp3.3
import java.util.*;
public class RevString{
    public static void main(String args[])
    {
        System.out.print("Enter a String:");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String reverse = new StringBuffer(str).reverse().toString();
        String rev = "";
        for(int i=str.length()-1;i>=0;i--)
            rev = rev + str.charAt(i);
        System.out.println("The Reversed String is: "+rev);
        System.out.println("Reversed String: "+reverse);
    }

}