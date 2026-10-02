import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReadingDemo
{
    public static void main(String[] args) {
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader("student.txt"));
            String line;

            while((line = reader.readLine())!=null)
            {
                System.out.println(line);
            }
            reader.close();
        }
        catch(IOException e)
        {
            System.out.println("An error occured");
        }
    }
}
/*
FileReader = reads character .
BufferedReader = makes reading text more convinient,especially line by line.

*/