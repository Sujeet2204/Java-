/*
throw = used to create exception ourselves.
        only one exception can be thrown at a time.
*/
class ThrowDemo
{
    public static void main(String[] args) {
        int age = 15;

        if(age<18)
        {
            throw new ArithmeticException("Age must be 18 or above");
        }
        System.out.println("Eligible");
    }
}