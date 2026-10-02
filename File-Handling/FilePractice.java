import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FilePractice 
{
    public static void main(String args[])
    {
        File file = new File("student.txt");

        try
        {
            FileWriter writer = new FileWriter(file);
            writer.write("My name is Sujeet Lamjane");
            writer.write("\nI am learning java");
            
            writer.close();

            FileReader reader = new FileReader(file);
            int ch;
            while((ch=reader.read())!=-1)
            {
                System.out.println((char)ch);
            }
            reader.close();
        }
        catch(IOException e)
        {
            System.out.println("An error occured.");
        }
    }
}