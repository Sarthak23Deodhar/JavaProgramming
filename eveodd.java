//exp4.3
import java.util.*;
public class eveodd{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        String num =in.next();
        int n = Integer.parseInt(num);
        if(n%2==0)
            System.out.println("The Number is Even");
        else
            System.out.println("The Number is Odd");
        in.close();
    }
}