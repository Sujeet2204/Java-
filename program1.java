import java.util.Scanner;
class program1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String Name = sc.next();

        System.out.println("Enter your Age : ");
        int Age = sc.nextInt();

        System.out.println("Name : "+Name);
        System.out.println("Age : "+Age);
    }
}