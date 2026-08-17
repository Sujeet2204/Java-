import java.util.Scanner;

class SumFirstN
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Enter a Number");
        int num = sc.nextInt();

        int sum = 0;
        for(int i=1;i<=num;i++)
        {
            sum = sum + i;
        }
        System.out.println("Sum = "+sum);
    }
}