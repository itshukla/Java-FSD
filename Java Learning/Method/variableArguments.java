public class variableArguments {
    // static void show(int ...x){
    //     for(int i : x){
    //         System.out.println(i);
    //     }

    static void showList(int start, String ...x){
      for(int i = 0; i < x.length; i++){
          System.out.println(start + ". " + x[i]);
          start++;
      }
    }
    

    public static void main(String[] args) {
        // show(10,20,30);
        // show(new int[]{1,2,3,4,5});
        showList(5,"shivam","rahul","kumar");

}
}
