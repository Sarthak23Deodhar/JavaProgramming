
public class Book2 
{
    String auth="Sarthak Deodhar";
    String title="100 Ways to find internship";
    String pub="Beanstalk";
    
    public static class BookInfo extends Book2
{
    int price = 799;
    String stock_position = "Low";
    
    

}
public static class BookSales extends BookInfo
    {
        int noofcopies = 108;
        void Revgen()
        {
            System.out.println("Revenue Generated: "+(noofcopies*price));

        }
        void Allshow()
    {
        System.out.println("Title Of The Book: "+title);
        System.out.println("Author Of The Book: "+auth);
        System.out.println("Publisher Of The Book: "+pub);
        System.out.println("Price Of The Book: "+price);
        System.out.println("Stock Available: "+stock_position);
        System.out.println("No.Of.Copies: "+noofcopies);
        Revgen();
        System.out.println("-----------------------------------");
        System.out.println("\n\n\n");
                  
    }


    }
public static void main(String args[])
{
    BookSales obj = new BookSales();
    obj.Allshow();
}

}


