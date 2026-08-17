import java.util.Scanner;

class prgram2
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int Num1 = sc.nextInt();

        System.out.print("Enter the Second number : ");
        int Num2 = sc.nextInt();

        System.out.println("Addition : "+(Num1+Num2));
        System.out.println("Substraction : "+(Num1-Num2));
        System.out.println("Multiplication : "+(Num1*Num2));
        System.out.println("Divide : "+(Num1/Num2));
    }
}