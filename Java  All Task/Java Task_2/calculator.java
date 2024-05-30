import java.util.*;

class calc {
    int num1;
    int num2;
}
public class calculator {

     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        calc c = new calc();

        System.out.println("Enter first numbers: ");
        c.num1 = sc.nextInt();

        System.out.println("Enter second numbers: ");
        c.num2 = sc.nextInt();
            System.out.println(" select your choice: \n1. Addition\n2. Substraction\n3. Multiplication\n4. Division");
        System.out.println("Enter your choice: ");

        int choice = sc.nextInt();

        if (choice == 1) {
            int sum = c.num1 + c.num2;
            System.out.println(" Addition of " + c.num1 + " and " + c.num2 + " are: " + sum);
     }

        else if (choice == 2) {
            int sub = c.num1 - c.num2;
            System.out.println(" substraction of " + c.num1 + " and " + c.num2 + " are: " + sub);
     }

        else if (choice == 3) {
            int mul = c.num1 * c.num2;
            System.out.println(" multiplication of " + c.num1 + " and " + c.num2 + " are: " + mul);
     }

        else if (choice == 4) {
            int div = c.num1 / c.num2;
            System.out.println(" divison of " + c.num1 + " and " + c.num2 + " are : " + div);
     }
     else{
        System.out.println("Invalid choice");
     }

     sc.close();
}
}