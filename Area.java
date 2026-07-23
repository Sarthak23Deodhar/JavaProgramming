import java.util.Scanner;
// Area of circle , rectangle, and square using constructor overloading.
public class Area {
    Scanner scanner= new Scanner(System.in);
    double radius;
    Area(double r)
    {
        radius=r;
        System.out.println("The area of the circle is: "+(3.14*radius*radius));
    }
    Area(double length,double breadth)
    {
        System.out.println("The area of the rectangle is: "+(length*breadth));
    }
    Area(Area obj2)
    {
        System.out.println("The area of the square is: "+(obj2.radius*obj2.radius));
    }
      public static void main(String args[])
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius=scanner.nextDouble();
        Area obj = new Area(radius);
        System.out.println("Enter the length of the rectangle: ");
        double length=scanner.nextDouble();
        System.out.println("Enter the breadth of the rectangle: ");
        double breadth=scanner.nextDouble();
        Area obj2= new Area(length,breadth);
        Area obj3 = new Area(obj);
        scanner.close();
}
}
