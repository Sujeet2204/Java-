import java.util.Scanner;

public class LargestArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        for(int i = 0;i<size;i++)
        {
            System.out.println("Enter the element : ");
            numbers[i] = sc.nextInt();
        }
        int largest = numbers[0];
        
        for(int i = 1;i<size;i++)
        {
            if(numbers[i]>largest)
            {
                largest = numbers[i];
            }
        }
        System.out.println("Largest number = "+largest);
    }
}