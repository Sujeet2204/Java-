//StringBuilder is Mutable (can be changed same object)
//Non synchronized 
//fast

class StringBuilderDemo{
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Sujeet");

        name.append(" Lamjane");   //append means add something at end
        System.out.println(name);
    }
}