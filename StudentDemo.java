/**
 * StudentDemo  //Contains main() and creates object
 * uses student.java 
 */
public class StudentDemo {

    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.name = "Sujeet";
        s1.age = 23;

        Student s2 = new Student();
        s2.name = "Swaraj";
        s2.age = 21;

        s1.display();
        s2.display();
    }
}