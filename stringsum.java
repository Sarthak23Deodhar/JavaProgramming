//exp4.2
import java.util.*;
public class stringsum{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the First Number:");
        String num1 = in.next();
        System.out.println("Enter the Second Number:");
        String num2 = in.next();
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int sum = n1+n2;
        System.out.println("The Sum of Two Numbers is:"+sum);
        in.close();
    }
}