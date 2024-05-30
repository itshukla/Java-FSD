class calculator{

    int num1;
    public int add(int n1 , int n2 ){
        return n1 + n2;
    }

    public int add(int n1 , int n2, int n3){
        return n1 + n2 + n3;
    }
    public double add(double n1 , double n2){
        return n1 + n2;
    }
}

public class calc {
    public static void main(String[] args) {
        calculator c = new calculator();
        int r = c.add(4,5);
        c.num1 = 9;
        System.out.println(c.num1);
        System.out.println(r);
    }
}
