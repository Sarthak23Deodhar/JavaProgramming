import java.util.Scanner;
public class switchcase
{
    public static void main(String args[])
    { Scanner scanner =new Scanner(System.in);
        int choice;
        do
        {
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
                System.out.println("Enter the 2 numbers:");
                int a= scanner.nextInt();
                int b= scanner.nextInt();
                System.out.println("Addition of Both Numbers is: "+(a+b));
                System.out.println("");
                System.out.println("");
                break;
            case 2:
                System.out.println("Enter the 2 numbers:");
                int c= scanner.nextInt();
                int d= scanner.nextInt();
                System.out.println("Subtracting: "+c+"-"+d+" = "+(c-d));
                System.out.println("");
                System.out.println("");
                break;
            case 3:
                System.out.println("Enter the 2 numbers:");
                int e= scanner.nextInt();
                int f= scanner.nextInt();
                System.out.println("Dividing: "+e+"/"+f+" = "+(e/f));
                System.out.println("");
                System.out.println("");
                break;
            case 4:
                System.out.println("Enter the 2 numbers:");
                int g= scanner.nextInt();
                int h= scanner.nextInt();
                System.out.println("Multiplication of Both Numbers is: "+(g*h));
                System.out.println("");
                System.out.println("");
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