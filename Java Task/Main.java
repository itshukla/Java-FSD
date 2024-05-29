import java.util.*;

class Person {
     String name;
     int age;
   
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
         p1.name = scanner.nextLine();

        System.out.print("Enter your age: ");
         p1.age = scanner.nextInt();


        System.out.println("Hello, " + p1.name + "! You are " + p1.age + " years old.");
        System.out.println();

        scanner.close();

}
}

