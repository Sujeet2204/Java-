import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;

public class BufferedWritingDemo
{
    public static void main(String args[])
    {
        try 
        {
            BufferedWriter writer = new BufferedWriter(new FileWriter("student.txt"));
            writer.write("Java File Handling");
            writer.newLine();  //moves to new line
            writer.write("BufferedWriter is easy.");
        
            writer.close();

            System.out.println("Data written successfully");
        }
        catch(IOException e)
        {
            System.out.println("An error occurred");
        }
    }
}