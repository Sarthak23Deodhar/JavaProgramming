import java.util.Scanner;
public class Cube
 {
    int side;
    int length;
    int height;
    int base;
    Cube(int n)
    {
       side = n;
       System.out.println(" The volume of the cube is: "+(side*side*side));
    }
    Cube(int l,int h,int b)
    {
        length = l;
        height = h;
        base = b;
        System.out.println(" The volume of the cuboid is: "+(length*height*base));
    }
    public static void main(String args[])
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the side of the cube: ");
        int side=scanner.nextInt();
        System.out.println("Enter the length of the cuboid: ");
        int length=scanner.nextInt();
        System.out.println("Enter the height of the cuboid: ");
        int height=scanner.nextInt();
        System.out.println("Enter the base of the cuboid: ");
        int base=scanner.nextInt();
        Cube obj = new Cube(side);
        Cube obj2 = new Cube(length, height, base);
        scanner.close();
    }
}
