import java.util.Scanner;
class ArraySum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        for(int i = 0;i<size;i++)
        {
            System.out.println("Enter element : ");
            numbers[i] = sc.nextInt();
        }
        int sum =0;
        for(int i = 0;i<size;i++)
        {
            sum = sum + numbers[i];
        }
        System.out.println("Sum of Array = "+sum);

    }
}