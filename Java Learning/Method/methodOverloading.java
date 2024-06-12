


public class methodOverloading {
    static int max(byte x , byte y){
        return x>y?x:y;
    }
    static int max(int x , int y , int z){
        return x>y && x>z?x:y>z?y:z;
    }
   static float max(float x , float y){
        if(x>y)
            return x;
        else
            return y;
        
    }
    public static void main(String[] args) {
        
        System.out.println(max(10,20,30));
        System.out.println(max(10.3f,20.4f));
        System.out.println(max(10,15));

    }
}

