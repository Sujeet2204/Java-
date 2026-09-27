/*
//Even there is no exception finally still executes
*/
public class FinallyDemo
{   
    public static void main(String[] args) {
        try
        {
            int a = 10;
            int b = 0;
            int result = a/b;

            System.out.println(result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divisible by zero.!");
        }
        finally 
        {
            System.out.println("This will always execute");
        }
    }

}
/*
    try = risky code
    catch = handling exception
    finally = executes at end even there's no exception
*/