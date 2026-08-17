import java.util.Scanner;

class ArrayInput
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for(int i =0;i<numbers.length;i++)
        {
            System.out.println("Enter number : ");
            numbers[i]= sc.nextInt();
        }
        System.out.println("Array elements are : ");
        for(int i = 0;i<n;i++)
        {
            System.out.println(numbers[i]);
        }
    }

}