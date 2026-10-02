import java.io.File;
import java.io.IOException;

public class FileHandlingDemo2
{
    public static void main(String[] args) {
        
        File file = new File("student.txt");

        try{
            if(file.createNewFile())
            {
                System.out.println("File created successfully");
            }
            else
            {
                System.out.println("File already exists");
            }
        }
        catch(IOException e)
        {
            System.out.println("An error occurred");
        }
        System.out.println("File Name: "+file.getName());
        System.out.println("File exists: "+file.exists());
        System.out.println("File path: "+file.getAbsolutePath());
        System.out.println("File size: "+file.length()+" bytes");
    }
}