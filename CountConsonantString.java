/**
 * CountConsonantString
 */
public class CountConsonantString {

    public static void main(String[] args) {
        String name = "sujeet";
        int count = 0;

        for(int i = 0;i<name.length();i++)
        {
            char ch = name.charAt(i);
            if(ch>='a' && ch<='z')
            {
                if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
                {
                    count++;            
                }
            }
        }
        System.out.println("Consonants = "+count);
    }
}