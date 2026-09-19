/**
 * StringBuilderReplace
 */
public class StringBuilderReplace {

    public static void main(String[] args) {
        
        StringBuilder name = new StringBuilder("Sujeet");

        name.replace(0, 3, "Raj"); //0 1 2 index replace
        System.out.println(name);
    }
}