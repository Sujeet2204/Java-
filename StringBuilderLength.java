/**
 * StringBuilderLength
 */
public class StringBuilderLength {

    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Sujeet");
        
        System.out.println("Length = "+name.length());
        System.out.println("Capacity = "+name.capacity());
    }
}