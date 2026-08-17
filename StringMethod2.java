/**
 * StringMethod2
 */
public class StringMethod2 {

    public static void main(String[] args) {
        
        String name1 = "Sujeet";
        String name2 = "Sujeet";
        String name3 = "sujeet";
        String name4 = "   Sujeet Lamjane   ";

        System.out.println("Name = "+name1);
        System.out.println("Lenght = "+name1.length());
        System.out.println("Uppercase = "+name1.toUpperCase());
        System.out.println("Lowercase = "+name1.toLowerCase());
        System.out.println("Character = "+name1.charAt(4));
        System.out.println("name1 and name2 equals = "+name1.equals(name2));
        System.out.println("name1 and name3 equals = "+name1.equalsIgnoreCase(name3));
        System.out.println("Contains = "+name1.contains("abc"));
        System.out.println("Starts with Su = "+name1.startsWith("Su"));
        System.out.println("End with et = "+name1.endsWith("et"));
        System.out.println("Substring (0,3) = "+name1.substring(0,3));
        System.out.println("Replace = "+name1.replace("S","R"));
        System.out.println("Trim = "+name4.trim());
        System.out.println("Index of t = "+name1.indexOf("t"));
        System.out.println("LastIndex of e = "+name1.lastIndexOf("e"));
    }
}