/*
throws = declare that the method may throw an exception.
        used in method declaration.
        Declare multiple exception.

throw = actually throws the exception.
        used inside method/block.
        throws one exception at a time.
*/
public class ThrowsDemo
{
    static void checkAge(int age) throws Exception
    {
        if(age<18)
        {
            throw new Exception("age must be 18 or more.");
        }
        System.out.println("Eligible");
    }
    public static void main(String[] args) {
        try
        {
            checkAge(15);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}