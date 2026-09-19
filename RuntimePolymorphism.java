//runtimepolymorphism using overriden method
class Animal {
    void sound()
    {
        System.out.println("Animal makes sound.");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks.");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat meow..");
    }
}

class RuntimePolymorphism{
    public static void main(String args[])
    {
        Animal a;   //reference type
        a = new Dog();  //actual object
        a.sound();

        a = new Cat();  //actual object
        a.sound();
    }
}