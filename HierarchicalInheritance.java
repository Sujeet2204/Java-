class Animal //parent
{
    void eat() 
    {
        System.out.println("Animal eats");
    }
}
class Dog extends Animal  //child 1
{
    void bark() 
    {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal  //child 2
{
    void meow()
    {
        System.out.println("Cat meows");
    }
}
/**
 * HierarchicalInheritance
 */
public class HierarchicalInheritance {

    public static void main(String[] args) {
        
        Dog d = new Dog();  //child1 inherited from parent 
        Cat c = new Cat();  //child2 inherited from parent

        d.eat(); //inherited
        d.bark(); //own method 

        c.eat();  //inherited
        c.meow(); //own method

    }
}