public class Array {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};
        arr[2] = 12;
        System.out.println(arr[2]);

        int nums[] = new int[4];
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
        System.out.println(nums[3]);

        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);

    }
}
}