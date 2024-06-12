
public class app {
    public static void main(String[] args) {
       Sub a = new Sub();
       int res = a.add(10, 50);
       int res1 = a.sub(12, 6);
       int res2 = a.mul(10, 5);
       int res3 = a.div(10, 5);
       System.out.println(res);
       System.out.println(res1);
       System.out.println(res2);
       System.out.println(res3);
    }
}



class Sub{
    public int sub(int a , int b){
        return a-b;
    }
}
class Add extends Sub{
    public int add(int a , int b){
        return a+b;
    }
}
 

class Mul extends Add{
    public int mul(int a , int b){
        return a*b;
    }
}

class Div extends Mul{
    public int div(int a , int b){  
        return a/b;
    }
}