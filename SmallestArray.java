import java.util.Scanner;

public class SmallestArray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size : ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        for(int i=0;i<size;i++)
        {
            System.out.print("Enter the element : ");
            numbers[i] = sc.nextInt();
        }
        int smallest = numbers[0];

        for(int i = 0;i<size;i++)
        {
            if(numbers[i]<smallest)
            {
                smallest = numbers[i];
            }
        }
        System.out.println("The smallest number = "+smallest);

    }
}