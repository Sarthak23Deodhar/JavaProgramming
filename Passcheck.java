//exp3.1
import java.util.*;
public class Passcheck{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String password = "HelloWorld";
        System.out.println("Enter your password: ");
        String input = scanner.nextLine();
        if(input.equals(password))
        {
            System.out.println("Entered password is correct");
        }
        else
        {
            System.out.println("Entered password is incorrect");
        }


}
}