public class factorial {
    public static void main(String[] args) {
        int n = 0;
        int fact = 1;
        if (n < 0) {
            System.out.println("Factorial of negative number does not exist");  
        }
        else if (n <= 0) {
            System.out.println("Factorial of O is: 1");  
        }
        else{
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }
    }
}
