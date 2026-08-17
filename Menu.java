import java.util.Scanner;

public class Menu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=========Menu=========");
        System.out.println("1. Java");
        System.out.println("2. Python");
        System.out.println("3. C");
        System.out.println("4. Exit");
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("You selected Java.");
                break;
            case 2:
                System.out.println("You selected Python.");
                break;
            case 3:
                System.out.println("You selected C.");
                break;
            case 4:
                System.out.println("Thank You!");
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }
    }
}