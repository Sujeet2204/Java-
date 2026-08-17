/**
 * CountDigitsString
 */
public class CountDigitsString {

    public static void main(String[] args) {
        String name = "Sujeet123";
        int count = 0;

        
        for(int i = 0;i<name.length();i++)
        {
            char ch = name.charAt(i);
            if(ch>'0' && ch<'9')
            {
                count++;
            }
        }
        System.out.println("Digits = "+count);
    }
}