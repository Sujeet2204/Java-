/*
    try = code that may throw an Exception(risky code)
    catch = Code to handle the exception (Handling code)
    */
class ExceptionDemo2
{
    public static void main(String[] args) {
        
        try   
        {
            int a = 10;
            int b = 0;
            int result = a/b;

            System.out.println(result);
        }
        catch(ArithmeticException e)  //e is variable
        {
            System.out.println("Cannot divide by zero");
        }
    }
}