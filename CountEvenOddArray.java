import java.util.Scanner;

/**
 * CountEvenOddArray
 */
public class CountEvenOddArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();

        int[] numbers = new int[size];
        for(int i =0;i<size;i++)
        {
            System.out.print("Enter the element : ");
            numbers[i] = sc.nextInt();
        }
        int Even =0;
        int Odd = 0;

        for(int i = 0;i<size;i++)
        {
            if(numbers[i] %2==0)
            {
                Even++;
            }
            else
            {
                Odd++;
            }
        }
        System.out.println("Even : "+Even);
        System.out.print("Odd : "+Odd);

    }
}