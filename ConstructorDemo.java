/**
 * ConstructorDemo class name student = constructor name student()
 */
class Student
{
    String name;
    int age;

    Student() // default constructor
    {
        System.out.println("Inside Constructor called");
    }
    void display()
    {
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
    }
}
public class ConstructorDemo {

    public static void main(String[] args) {
        
        Student s1 = new Student();   //when this runs java automatically calls Student();

        s1.name = "Sujeet";
        s1.age = 23;

        s1.display();
    }
}