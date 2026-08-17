import java.util.Scanner;

class CountEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int iCount = 0;
        for(int i =1;i<=num;i++)
        {
            if(i%2==0)
            {
                iCount++;
            }
        }
        System.out.println("Total Even numbers are = "+iCount);
    }
}