import java.util.Scanner;
public class RevDigits
{
    public static void main(String args[])
    {
        System.out.println("Enter the Number to be Reversed:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int reversed=0;
        while (a!= 0) {
            int digit = a % 10;          
            reversed = reversed * 10 + digit; 
            a/= 10;                   
        }
        System.out.println("Reversed Number is: "+reversed);
        scanner.close();
    }
}
