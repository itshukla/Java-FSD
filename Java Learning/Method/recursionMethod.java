public class recursionMethod {
    static void fun(int n){
        if(n>0){
           // fun(n-1);
            System.out.println(n);
            fun(n-1);
        }

        returnType methodName(){
            //body
        }


    }

    public static void main(String[] args) {
        fun(5);
    }
}
