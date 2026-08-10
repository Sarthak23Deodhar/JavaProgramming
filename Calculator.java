import java.util.Scanner;
public class Calculator
{
    public static void main(String args[])
    { Scanner scanner =new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("Enter 2 numbers :");
            String num1 = scanner.next();
            String num2 = scanner.next();
            int n1= Integer.parseInt(num1);
            int n2= Integer.parseInt(num2);
        System.out.println("Enter Your Choice of Operation:");
        System.out.println("Enter 1 for Addition.");
        System.out.println("Enter 2 for Subtraction.");
        System.out.println("Enter 3 for Division.");
        System.out.println("Enter 4 for Multiplication.");
        System.out.println("Enter 0 to Exit...");
        choice = scanner.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Addition of Both Numbers is: "+(n1+n2));
                
                break;
            case 2:
                System.out.println("Subtracting: "+n1+"-"+n2+" = "+(n1-n2));
                
                break;
            case 3:
                System.out.println("Dividing: "+n1+"/"+n2+" = "+(n1/n2));
                
                break;
            case 4:
                System.out.println("Multiplication of Both Numbers is: "+(n1*n2));
                
                break;
            case 0:
                 System.out.println("Exiting...");
                 System.exit(0);
            default:
                    System.out.println("Wrong Input Try Again!!");
                    
        }
       }while(choice!=0);
       scanner.close();
   }
}