import java.util.*;
public class mobile 
{
    String company_name;
    String screen_size;
    mobile(String name,String size)
    {
        company_name=name;
        screen_size=size;
        
    }
    public static void main(String args[])
    {
        Scanner scanner= new Scanner(System.in);
        int n=5;
        mobile obj[]=new mobile[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the company name of mobile "+(i+1)+": ");
            String name=scanner.nextLine();
            System.out.println("Enter the screen size of mobile "+(i+1)+": ");
            String size=scanner.nextLine();
            obj[i]=new mobile(name,size);
            
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("The company name of mobile "+(i+1)+" is: "+obj[i].company_name);
            System.out.println("The screen size of mobile "+(i+1)+" is: "+obj[i].screen_size);
        }
        scanner.close();
}
}




