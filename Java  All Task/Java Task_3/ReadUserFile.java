import java.io.*;
import java.util.*;

public class ReadUserFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for filename
        System.out.print("Enter the filename: ");
        String filename = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            // Read file line by line
            System.out.println("Contents of the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + filename);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

