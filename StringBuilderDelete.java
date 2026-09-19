/**
 * StringBuilderDelete
 */
public class StringBuilderDelete {

    public static void main(String[] args) {
        
        StringBuilder name = new StringBuilder("Sujeet");

        name.delete(2,5);  //removes j e
        System.out.println(name);
    }
}