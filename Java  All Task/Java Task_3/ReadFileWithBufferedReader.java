import java.io.*;

public class ReadFileWithBufferedReader {

  public static void main(String[] args) {
    String fileName = "shukla.txt"; // Replace with your actual file name

    try {
      // Create a FileReader object
      FileReader reader = new FileReader(fileName);

      // Wrap FileReader in a BufferedReader for efficient reading
      BufferedReader bufferedReader = new BufferedReader(reader);

      String line;

      // Read file line by line until the end (null) is reached
      while ((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
      }

      // Close the BufferedReader and FileReader
      bufferedReader.close();
      reader.close();
      System.out.println("File content read successfully.");

    } catch (IOException e) {
      System.err.println("Error reading file: " + e.getMessage());
    }
  }
}

