import java.util.Arrays;
/**
 * AnagramString
 */
public class AnagramString {

    public static void main(String[] args) {
        String name1 = "listen";
        String name2 = "silent";

        char[] a = name1.toCharArray();
        char[] b = name2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b))
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not Anagram");
        }
    }
}