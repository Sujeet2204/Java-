/**
 * ConstructorOverloading  = same constructor name is overloading
 */

class Student{
    String name;
    int age;

    Student()  //default Constructor
    {
        name = "Unknown";
        age = 0;
    }
    Student(String name,int age)  //parametrized  constructor
    {
        this.name = name;
        this.age = age;
    }
    void display()
    {
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
    }
}

public class ConstructorOverloading {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Sujeet",23);

        s1.display();
        s2.display();
    }
}