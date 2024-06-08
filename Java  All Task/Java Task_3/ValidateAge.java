import java.util.Scanner;

public class ValidateAge {

     static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user for age
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Validate age
            validateAge(age);

            System.out.println("Valid age. You can proceed.");
        } catch (InvalidAgeException e) {
            System.out.println("Error: Invalid age - " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException(age);
        }
    }
}

class InvalidAgeException extends Exception {
    private final int age;

    public InvalidAgeException(int age) {
        super("Age must be between 0 and 120.");
        this.age = age;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " Entered age: " + age;
    }
}
