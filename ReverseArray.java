import java.util.Scanner;

class ReverseArray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0;i<n;i++)
        {
            System.out.println("Enter element : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Reverse array is : ");
        for(int i = n-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}