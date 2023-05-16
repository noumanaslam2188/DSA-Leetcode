import java.util.Arrays;

public class Sum_array {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
       // int[] ans=new int[4];

//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j <=i; j++) {
//                ans[i]+=nums[j];
//            }


        int[] reult=running_sum(nums);
        System.out.println(Arrays.toString(reult));


    }
    static int[] running_sum(int[] nums){
        for(int i=1;i<nums.length; i++){
            nums[i]+=nums[i-1];

        }
        return nums;
    }
}
