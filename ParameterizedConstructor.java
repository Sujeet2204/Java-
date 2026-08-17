/**
 * ParameterizedConstructor
 */
class Student
{
    String name;
    int age;

    Student(String n,int a)//parameterized constructor
    {
        name = n;
        age = a;
    }
    void display()
    {
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
    }
}

public class ParameterizedConstructor {

    public static void main(String[] args) {
    Student s1 = new Student("Sujeet",23);
    Student s2 = new Student("Swaraj",21);
    
    s1.display();
    s2.display();

    }
}