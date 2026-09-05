class Person               //parent class          * Parent class -> child class
{
    void speak()
    {
        System.out.println("Person can speak");
    }
}
class Student extends Person   //child class
{
    void study()
    {
        System.out.println("Student is studying");
    }
}

class SingleInheritance{
    public static void main(String[] args) {
    
    Student s = new Student();

    s.speak(); //inherited method
    s.study(); //student own method

    }
}