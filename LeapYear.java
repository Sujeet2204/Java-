/*A year is leap year if 
1.it is divisible by 400 
2. It is divisible by 4 but not divisible by 100 */

import java.util.Scanner;

class LeapYear{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Year");
        int year = sc.nextInt();

        if(year % 400 == 0 || (year % 4 ==0 && year % 100 !=0))
        {
            System.out.println(year + " is a Leap Year");
        }
        else
        {
            System.out.println(year + " is Not a Leap Year");
        }
    }
}