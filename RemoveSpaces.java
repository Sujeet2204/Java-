/**
 * RemoveSpaces
 */
public class RemoveSpaces {

    public static void main(String[] args) {
        String sentence = "Java is easy";
        String result = "";

        for(int i = 0;i<sentence.length();i++)
        {
            char ch = sentence.charAt(i);
            if(ch!=' ')
            {
                result = result+ch;
            }
        }
        System.out.println("After removing spaces = "+result);
    }
}