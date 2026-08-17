import java.util.Scanner;

/**
 * SearchArray
 */
public class SearchArray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the element : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search : ");
        int search = sc.nextInt();

        boolean found = false;
        
        for(int i =0;i<n;i++)
        {
            if(search==arr[i])
            {
                found = true;
                break;
            }
        }
        if(found)
        {
            System.out.println("Element found");
        }
        else
        {
            System.out.println("Element not found!");
        }
    }
}