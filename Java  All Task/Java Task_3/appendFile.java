import java.io.*;

public class appendFile {

    public static void appendStringToFile(String fileName, String text) {
        try {
            // Create a BufferedWriter object with FileWriter in append mode
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            // Write the text to the file and add a new line character
            writer.write(text);
            writer.newLine();

            // Close the writer
            writer.close();
            System.out.println("Text appended successfully to " + fileName);
        } catch (IOException e) {
            // Catch any exceptions and print the error message
            System.err.println("Error appending text to file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String fileName = "myFile.txt"; // Replace with your desired file name
        String textToAppend = "This is the text to be appended.";

        appendStringToFile(fileName, textToAppend);
    }
}
