import java.util.*;
class cic{
    float radius;
    float pi ;
}


public class circle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        cic c = new cic();

        System.out.print("Enter the radius: ");
        c.radius = sc.nextFloat();

        c.pi = 3.14f;

        float area = c.pi * c.radius * c.radius;

        System.out.println("Area of circle is: " + area);

        sc.close();

    
}
}
