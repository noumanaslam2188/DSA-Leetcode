import java.util.Arrays;

public class Concatination_array {
    public static void main(String[] args) {
//
//        int[] nums={1,2,1};
//
//        int[] n=new int[6];
//
//        for (int i = 0; i < nums.length; i++) {
//            n[i]=nums[i];
//            n[i+3]=nums[i];
//
//
//
//
//        }
//        System.out.println(Arrays.toString(n));




        //Through method
        int[] nums={1,2,1};
        int[] result=concatination(nums);
        System.out.println(Arrays.toString(result));


    }
    static int[] concatination (int[] nums){
        int[] ans=new int[6];

        for (int i = 0; i < nums.length; i++) {
            ans[i]=nums[i];
            ans[i+3]=nums[i];

        }



        return ans;
    }


}
