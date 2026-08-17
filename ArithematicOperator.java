import java.util.Scanner;

class ArithematicOperator
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();
    
        System.out.println("Addtion = "+(num1+num2));
        System.out.println("Substraction = "+(num1-num2));
        System.out.println("Multiplication = "+(num1*num2));
        System.out.println("Division = "+(num1/num2));
        System.out.println("Remainder = "+(num1%num2));
    }
}