/**
 * AbstractionDemo = hiding implementation details and showing only important part to user
 * abstract method is not declare in abstract class 
 * it is declared in child/subclass class
 */
abstract class Animal
{
    abstract void sound();
}
class Dog extends Animal
{
    void sound()
    {
        System.out.println("Dog Barks...");
    }
}
public class AbstractionDemo {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();
    }
}