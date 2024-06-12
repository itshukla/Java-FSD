

public class oopss {
    public static void main(String[] args) {

        Pen p = new Pen();// created a pen object p
        p.setColor("blue");
        p.setTip(5);
        System.out.println(p.color);

        BankAccount b = new BankAccount();
        b.userName = "Shivam";
        //b.password = "1234"; 
        b.setPassword("12345");   
    }
}

class Pen{
    // properties
    String color;
    int tip;

    // methods
    void setColor(String newColor){
        color = newColor;

    }
    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int math, int chem){
        percentage = (phy+math+chem)/3;
    }
}

class BankAccount{
    public String userName;
    private String password;

    public void setPassword(String newPassword){
        password = newPassword;
    }
}