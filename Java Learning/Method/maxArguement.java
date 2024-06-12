public class maxArguement{

int max(int ...x){
    if(x.length == 0)
    return Integer.MIN_VALUE;
    int m = x[0];
    for(int i = 1; i < x.length; i++){
        if(x[i] > m)
        m = x[i];
    }
    return m;
}
    public static void main(String[] args) {
        
        maxArguement m = new maxArguement();
        System.out.println(m.max(10,20,30,40,50));
    }
}
