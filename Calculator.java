import java.util.Scanner;

public class Calculator{
    public static void main(String  []args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = sc.nextInt();

        System.out.println("Enter the second number : ");
        int b = sc.nextInt();

        int choice;

        do {
        System.out.println("-------------Choose Operation-----------");
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5.Exit");
        System.out.println("Enter your Choice: ");
        choice = sc.nextInt();

        switch(choice)
        {
            case 1:
                System.out.println("Addtion = "+(a+b));
                break;
            case 2:
                System.out.println("Substraction = "+(a-b));
                break;
            case 3:
                System.out.println("Multiplication = "+(a*b));
                break;
            case 4:
                if(b!=0)
                    System.out.println("Divisin = "+(a/b));
                else
                    System.out.println("Division by zero is not possible..!");
                break;
            case 5:
                System.out.println("Exited...!");
                sc.close();
                return;
            default:
                System.out.println("Invalid Choice");
            }         
            
        }
        while (choice!= 5);
    }
}