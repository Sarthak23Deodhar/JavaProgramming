import java.util.Scanner;
class Greatest{
 public static void main(){
  Scanner scanner= new Scanner(System.in);
  System.out.println("Enter The First Number:");
  int a = scanner.nextInt();
  System.out.println("Enter The Second Number:");
  int b = scanner.nextInt();
  System.out.println("Enter The Third Number:");
  int c = scanner.nextInt();
  if(a>b&&a>c)
   System.out.println(a+" is the Greatest Number");
  else if( b>a&&b>c)
   System.out.println(b+" is the Greatest Number");
  else
   System.out.println(c+" is the Greatest Number");
  scanner.close();
  }
}	