class Demo          //overloading using diff order of parameters
{
    void display(int a, String b)
    {
        System.out.println("Integer : "+a);
        System.out.println("String : "+b);
    }
    void display(String a, int b)
    {
        System.out.println("String : "+a);
        System.out.println("Integer : "+b);
    }
}
class MethodOverloading3  {
    public static void main(String[] args) {
        
        Demo d = new Demo();

        d.display(10,"Sujeet");
        d.display("Swaraj",20);
    }
}