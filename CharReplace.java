//exp3.7
import java.util.*;
public class CharReplace{
    public static void main ( String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter The String:");
        String str = in.nextLine();
        System.out.print("Enter the Replacement Character:");
        String Char = in.next();
        System.out.print("Enter the index to replace:");
        int index = in.nextInt();
        String newStr = str.substring(0,index) + Char + str.substring(index+1);
        System.out.println("The new String is: "+newStr);
        

    }
}