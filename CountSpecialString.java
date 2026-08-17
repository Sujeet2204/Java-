/**
 * CountSpecialString
 */
public class CountSpecialString {

    public static void main(String[] args) {
        String name = "@Sujeet123";
        int count = 0;

        for(int i =0;i<name.length();i++)
        {
            char ch = name.charAt(i);
            if(!((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9')))
            {
                count++;
            }
        }
        System.out.println("Special Character = "+count);
    }
}