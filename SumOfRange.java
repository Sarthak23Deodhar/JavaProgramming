import java.util.Scanner;
public class SumOfRange
{
    public static void main(String args[])
    {
        System.out.println("Enter The Start of Range:");
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        System.out.println("Enter The End of Range:");
        int b= scanner.nextInt();
        int sum=0;
        for(int i=a;i<b;i++)
        {
            sum+=i;
        }
        System.out.println("Sum of Numbers in the given Range is : "+sum);
        scanner.close();
    }
}