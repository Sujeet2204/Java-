import java.util.Scanner;

class program4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        if(num%5==0)
        {
            System.out.println("Number"+" "+num +"is Divisible by 5");
        }
        else
        {
            System.out.println("Number"+" "+num +"is not Divisible by 5");
        }
        
    }
}