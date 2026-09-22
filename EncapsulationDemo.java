/**
 * EncapsulationDemo = it is the process of wrapping methods and variable into single class,and protect direct access.
 */
class Student{
    private String name;
    private int age;
}
public class EncapsulationDemo {

    public static void main(String[] args) {
        
        Student s = new Student();
        s.age = 20;  //Error because age is not accessed by main class .
        
    }
}