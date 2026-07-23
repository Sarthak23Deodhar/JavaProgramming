import java.util.Scanner;
//create a javaclass student with variables name, roll number, department, and marks.implement constructor overloading for the above statement.
public class student
 { 
    String name;
    String department;
    double marks;
    int roll;
    student()
    {
        name="Unknown";
        department="Unknown";
        marks=0.0;
        roll=0;

    }
    student(String n,String d,double m,int r)
    {
        name=n;
        department=d;
        marks=m;
        roll=r;
    }

public static void main(String args[])
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the name of the student: ");
        String name=scanner.nextLine();
        System.out.println("Enter the department of the student: ");
        String department=scanner.nextLine();
        System.out.println("Enter the marks of the student: ");
        double marks=scanner.nextDouble();
        System.out.println("Enter the roll number of the student: ");
        int roll=scanner.nextInt();
        student obj = new student(name,department,marks,roll);
        System.out.println("---------------------------------");
        System.out.println("The name of the student is: "+obj.name);
        System.out.println("The department of the student is: "+obj.department);
        System.out.println("The marks of the student is: "+obj.marks);
        System.out.println("The roll number of the student is: "+obj.roll);
        System.out.println("---------------------------------");
        
        scanner.close();
    }
    
}