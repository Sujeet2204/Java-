//Mehod overloading using diff datatype
class Demo  
{
    void show(int a)
    {
        System.out.println("Integer : "+a);
    }
    void show(String a)
    {
        System.out.println("String : "+a);
    }
}


class MethodOverloading2
{
    public static void main(String[] args) {
        
        Demo d = new Demo();
        
        d.show("Sujeet");
        d.show(10);
    }
}