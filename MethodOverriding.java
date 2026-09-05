class Animal  //parent class
{
    void sound()
    {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal //child class (Dog inherits from Animal)
{
    void sound()
    {
        System.out.println("Dog barks");
    }
}

class MethodOverriding
{
    public static void main(String args[])
    {
        Dog d = new Dog();
        d.sound();
    }
}