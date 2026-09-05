// Grandparent -> Parent -> Child
class Animal
{
    void eat()
    {
        System.out.println("Animal eats");
    }
}
class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog barks");
    }
}
class puppy extends Dog
{
    void play()
    {
        System.out.println("Puppy plays");
    }
}
public class MultilevelInheritance 
{
    public static void main(String[] args) 
    {
        
        puppy p = new puppy();
        
        p.eat();  //inherited from grandparent
        p.bark(); //inherited from parent
        p.play(); //own method
    }
}