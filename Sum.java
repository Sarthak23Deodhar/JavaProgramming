import java.util.Scanner;
class Sum{
 public static void main(String args[]){
  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter The Number:");
  int num=scanner.nextInt();
  int sum=0;
  while (num > 0) {
    sum += num % 10;  
    num /= 10;        
  }
  System.out.println("Sum of digits of the Number Given is : "+sum);
  scanner.close();
  }
}

