
class calculator {
    
    
    public int add(int a , int b){
       int r = a + b;
       return r;
    }

}

public class demo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        // int result = num1 + num2;

        // System.out.println(result);

        calculator c = new calculator();
       
        int sum = c.add( num1,num2);
        System.out.println(sum);
         

      

    }
}
