import java.io.FileWriter;
import java.io.IOException;

public class AppendDemo
{
    public static void main(String[] args) {
        try
        {
            //true append new content, instead of replacing existing content.
            FileWriter writer = new FileWriter("student.txt",true); 

            writer.write("\n I am learning File Handling.");
            writer.close();

            System.out.println("Data appended successfully");
        }
        catch(IOException e)
        {
            System.out.println("an error occured");
        }
    }
}
