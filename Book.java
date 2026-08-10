
public class Book 
{
    String auth="Sarthak Deodhar";
    String title="100 Ways to find internship";
    String pub="Beanstalk";
    
    public static class BookInfo extends Book
{
    int price = 799;
    String stock_position = "Low";
    void show()
    {
        System.out.println("Title Of The Book: "+title);
        System.out.println("Author Of The Book: "+auth);
        System.out.println("Publisher Of The Book: "+pub);
        System.out.println("Price Of The Book: "+price);
        System.out.println("Stock Available: "+stock_position);
        System.out.println("-----------------------------------");
        System.out.println("\n\n\n\n");
                  
    }

}
public static void main(String args[])
{
    BookInfo obj = new BookInfo ();
    BookInfo obj1 = new BookInfo ();
    BookInfo obj2 = new BookInfo ();
    obj.show();
    obj1.show();
    obj2.show();
}

}


