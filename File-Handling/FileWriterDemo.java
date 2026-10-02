/*

    FileWriter normally replaces the existing contents , later we will learn how to append.

*/
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo
{
    public static void main(String[] args) {
        
        try{
            FileWriter writer = new FileWriter("student.txt"); //open file for writing

            writer.write("My name is sujeet."); //writes text into file
            writer.write("\nI am learning java.");

            writer.close(); //close file after writing
            System.out.println("Data written successfully...");
        }
        catch(IOException e)
        {
            System.out.println("An error occurred!!!");
        }
    }
}