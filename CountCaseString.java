/**
 * CountCaseString
 */
public class CountCaseString {

    public static void main(String[] args) {
        String name = "SuJeeT";
        int uppercase = 0;
        int lowercase = 0;

        for(int i =0;i<name.length();i++)
        {
            char ch = name.charAt(i);
            
            if(ch>'A' && ch<'Z')
            {
                uppercase++;
            }
            else
            {
                lowercase++;
            }
        }
        System.out.println("Uppercase = "+uppercase);
        System.out.println("Lowercase = "+lowercase);
    }
}