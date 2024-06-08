import java.io.File;

public class GetFileSize {

  public static void main(String[] args) {
    String fileName = "myFile.txt";

    File file = new File(fileName);

    if (file.exists()) {
      long fileSizeInBytes = file.length();
      double fileSizeInKB = (double) fileSizeInBytes / 1024;
      double fileSizeInMB = fileSizeInKB / 1024;

      System.out.println("File size in bytes: " + fileSizeInBytes);
      System.out.printf("File size in kilobytes (KB): %.2f\n", fileSizeInKB);
      System.out.printf("File size in megabytes (MB): %.2f\n", fileSizeInMB);
    } else {
      System.err.println("Error: File \"" + fileName + "\" does not exist.");
    }
  }
}
