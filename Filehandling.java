import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.*;
// import java.io.FileNotFoundException;

class Filehandling{
    public static void main(String[] args) throws IOException {

        
        // *****Writing in file */
        try{
            FileWriter Writer=new FileWriter("myFile.txt");
            Writer.write("IchBinSpark.");
            Writer.close();
            System.out.println("Successfully written in file.");
        }
        catch(IOException e){
            System.out.println("An error has occured");
            e.printStackTrace();
        }
        // finally 

        // ****Reading from File */
        // File obj=new File("myfile.txt");
        System.err.println("File successfully created!");
        try{
            File obj=new File("myFile.txt");
            Scanner Reader = new Scanner(obj);
            while(Reader.hasNextLine()){
                String data = Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();
             if(obj.createNewFile()){
                 System.out.println("File created: " + obj.getName());
             }
             else{
                 System.err.println("File already exists!");
             }
        }
        catch(FileNotFoundException e){
            System.out.println("An error has occured.");
            e.printStackTrace();
        }
    }//
}