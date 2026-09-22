/*
Getter method used to read value,hence it returns the value.
*/

class Student
{
    private int age;

    int getAge()
    {
        return age;
    }
}

public class EncapsulationDemo2 {

    public static void main(String[] args) {
    Student s = new Student();
    
    System.out.println(s.getAge());
    }
}