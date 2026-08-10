//exp4.1
import java.util.Scanner;
public class wrapper {
    public static void main (String args[])
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter A number:" );
        String num = in.next();
        System.out.println("Your Number:"+num);
        int n = Integer.parseInt(num);
        System.out.println("Wrapper Object:"+n);
        System.out.println("Primitive Value:"+num);
        in.close();

    }
    
}
