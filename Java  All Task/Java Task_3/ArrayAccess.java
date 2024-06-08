import java.util.Scanner;

public class ArrayAccess {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] numbers = {10, 20, 30, 40, 50};

      
        System.out.print("Enter an index (0 to " + (numbers.length - 1) + "): ");
        int index;
        try {
            index = scanner.nextInt();

         
            System.out.println("The element at index " + index + " is: " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index. Please enter a value between 0 and " + (numbers.length - 1));
        }

        
    }
}

