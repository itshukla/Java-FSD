

public class methodPractice1{
            // formal parameter
     int max(int x , int y){
        if(x>y)
         
            return x;
        else
            return y;
    }
    public static void main( String args[]){
            int a = 10, b=15, c;
            methodPractice1 mp = new methodPractice1();
            c= mp.max(a,b); //actual Parameter

            System.out.println(c);

    }
}