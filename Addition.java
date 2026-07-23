import java.util.Scanner;
class Addition{
 public static void main(String args[]){
  Scanner scanner = new Scanner(System.in);
  System.out.println("Enter The First Number:\n");
  int a= scanner.nextInt();
System.out.println("Enter The Second Number:\n");
  int b = scanner.nextInt();
  int c=a+b;
  System.out.println("Addition of both Numbers: "+c);
  scanner.close();
  }
}
  