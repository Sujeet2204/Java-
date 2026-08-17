/**
 * Two Object from One Class
 */
class Student
{

    String name;
    int age;

    void Display()
    {
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
    }
}

public class TwoObjectOneClass {
    public static void main(String[] args) {
    
    Student s1 = new Student();
    
    s1.name = "Sujeet";
    s1.age = 22;

    Student s2 = new Student();

    s2.name = "Swaraj";
    s2.age = 20;

    s1.Display();
    s2.Display();
    
    }
    
}