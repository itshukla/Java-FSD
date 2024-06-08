import java.io.*;

public class ReadFileWithBufferedReader {

  public static void main(String[] args) {
    String fileName = "shukla.txt"; 

    try {
     
      FileReader reader = new FileReader(fileName);

     
      BufferedReader bufferedReader = new BufferedReader(reader);

      String line;

      
      while ((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
      }

      
      bufferedReader.close();
      reader.close();
      System.out.println("File content read successfully.");

    } catch (IOException e) {
      System.err.println("Error reading file: " + e.getMessage());
    }
  }
}

