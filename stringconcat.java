//exp3.8
import java.util.*;
public class stringconcat{
    public static void main(String args[])
    {
        System.out.print("Enter your First Name:");
        Scanner in = new Scanner(System.in);
        String fn = in.next();
        System.out.print("Enter your Last Name:");
        String ln = in.next();
        String fullname = fn + " " + ln;
        System.out.println("Full Name is: " + fullname);
    }

}