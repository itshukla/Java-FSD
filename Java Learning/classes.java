

class Students {
    String name;
    int id;
    String email;


    public void display() {
        System.out.println("Name: " + name);
       
    }

    public void display_id() {
        System.out.println("ID: " + id);
}

    public void display_email() {
        System.out.println("Email: " + email);

    }
}

public class  classes{

    public static void main(String[] args) {

        Students s1 = new Students();
        s1.name = "Sarkar";
        s1.id = 1;
        s1.email = "sarkar@123";
         s1.display();
         s1.display_id();    
         s1.display_email();

        

    
}
}
 