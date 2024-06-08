import java.io.*;

public class appendFile {

    public static void appendStringToFile(String fileName, String text) {
        try {
          
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

           
            writer.write(text);
            writer.newLine();

           
            writer.close();
            System.out.println("Text appended successfully to " + fileName);
        } catch (IOException e) {
            
            System.err.println("Error appending text to file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String fileName = "myFile.txt"; 
        String textToAppend = "Hello Mr. Shukla this content appended";

        appendStringToFile(fileName, textToAppend);
    }
}
