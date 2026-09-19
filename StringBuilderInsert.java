/**
 * StringBuilderInsert
 */
public class StringBuilderInsert {

    public static void main(String[] args) {
        
        StringBuilder name = new StringBuilder("Sujeet");

        name.insert(3, "XYZ");  //insert means add something at specific position.
        System.out.println(name);
    }
}