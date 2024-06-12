
public class methodObject {
    static void change(int x[],int index, int value){
        x[index] = value;
    }

    static void change2(int x , int vlaue){
        x = vlaue;
        

    }
    public static void main(String[] args) {
        
        int A[] = {2,3,4,5,6};
       change(A,2,30);
       for (int i : A) {
            System.out.println(i);
       }

       int x = 50;

       change2(x,100);
       System.out.println("value of premitive " + x);

       
        
    }
}
