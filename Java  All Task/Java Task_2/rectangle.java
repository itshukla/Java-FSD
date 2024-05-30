import java.util.*;
public class rectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length: ");
        int length = sc.nextInt();

        System.out.print("Enter the breadth: ");
        int breadth = sc.nextInt();

        System.out.println("Area of rectangle is: " + (length*breadth));

        sc.close();
        
    }
}
