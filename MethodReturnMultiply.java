/**
 * MethodReturnMultiply
 */
public class MethodReturnMultiply {

    static int multiply(int a , int b)
    {
        int multi = a * b;
        return multi;
    }
    public static void main(String[] args) {
        
        int result = multiply(4,2);
        System.out.println("Multiplication = "+result);
    }
}