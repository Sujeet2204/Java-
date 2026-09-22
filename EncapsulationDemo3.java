/**
 * EncapsulationDemo3 = contains getter + setter method , 
 * Getter = read/returns the value.
 * Setter = set/change the value
 */
class Student
{
    private int age;

    //getter
    int getAge() {
        return age;
    }
    //setter
    void setAge(int age){
        this.age=age;
    }
}
public class EncapsulationDemo3 {
    public static void main(String[] args) {
        Student s = new Student();

        s.setAge(22);

        System.out.println(s.getAge());
    }
    
}