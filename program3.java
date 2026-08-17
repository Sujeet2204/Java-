import java.util.Scanner;
class program3
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length : ");
        int length = sc.nextInt();

        System.out.print("Enter width : ");
        int width = sc.nextInt();

        System.out.println("Area = "+(length*width));
        System.out.println("Perimeter = "+(2*(length+width)));
    }
}