/**
 * MethodOverloading
Method 1 and Method 2 has same name but different parameters , so its MethodOverloading
*/

class Calculator
{
    void add(int a,int b) //method 1
    {
        System.out.println("Sum = "+(a+b));
    }
    void add(int a,int b,int c) //method 2
    {
        System.out.println("Sum = "+(a+b+c));
    }
}

public class MethodOverloading {

    public static void main(String[] args) {
        
    Calculator c1 = new Calculator();

    c1.add(10,20);
    c1.add(10,20,30);
}
}