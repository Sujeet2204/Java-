
import java.io.FileReader;

import java.io.IOException;

public class FileReadingDemo {

    public static void main(String[] args) {
        
        try
        {
            FileReader reader = new FileReader("student.txt");
            int ch;  //int because java uses special value -1
            
            while((ch=reader.read())!=-1)  // it read until it reach end of the file -1.
            {
                System.out.print((char) ch);  //(char)ch  converts number into its actual character.
            }
            reader.close();
        }
        catch(IOException e)
        {
            System.out.println("An error occurred");
        }
    }
}