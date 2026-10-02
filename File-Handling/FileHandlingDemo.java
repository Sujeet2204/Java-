/*
in this file we created file object not file yet.
in next file we will create it 
*/
import java.io.File;

public class FileHandlingDemo
{
    public static void main(String[] args) {
        
        File file = new File("student.txt");  //File object , does not create actual file yet.

        System.out.println(file.exists());

    }
}