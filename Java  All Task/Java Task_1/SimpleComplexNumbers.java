import java.util.*;
public class SimpleComplexNumbers {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter real part of first number: ");
        double real1 = scanner.nextDouble();

        System.out.print("Enter imaginary part of first number: ");
        double imag1 = scanner.nextDouble();

        System.out.print("Enter real part of second number: ");
        double real2 = scanner.nextDouble();

        System.out.print("Enter imaginary part of second number: ");
        double imag2 = scanner.nextDouble();

        double newReal = real1 + real2;
        double newImag = imag1 + imag2;

       
        System.out.println("Sum of complex numbers: (" + real1 + " + " + imag1 + "j) + (" + real2 + " + " + imag2 + "j) = " + newReal + " + " + newImag + "j");

        scanner.close();
    }
}
