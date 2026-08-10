//exp4.4
import java.util.*;
public class greatestof3{
    public static void main (String args[])
    {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter 1st Num:");
        String num1 = in.next();
        System.out.println("Enter 2nd Num:");
        String num2 = in.next();
        System.out.println("Enter 3rd Num:");
        String num3 = in.next();
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int n3 = Integer.parseInt(num3);
        int max = Math.max(n1, Math.max(n2, n3));
        System.out.println("Greatest Number is: "+max);
        in.close();
    }
}