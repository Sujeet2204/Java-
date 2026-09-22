/**
 * EncapsulationDemo4 = before change the hidden data,it will check whether the value is valid.
 */

class Student
{
    private int age;

    int getAge()
    {
        return age;
    }

    void setAge(int age)
    {
        if(age>=0)
        {
            this.age = age;
        }
        else
        {
            System.out.println("Invalid age!!!");
        }
    }
}
public class EncapsulationDemo4 {

    public static void main(String[] args) {
        Student s = new Student();

        s.setAge(22);
        System.out.println(s.getAge());

        s.setAge(-5);
        System.out.println(s.getAge());

    }
}