import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Permutation_array {
      public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//
//      int[] nums={0,2,1,5,3,4};
//        buildarray(nums);
//        System.out.println(Arrays.toString(nums));
//    }
//
//
//
//
//    static int[] buildarray(int[] nums){
//        int[] ans=new int[6];
//
//
//        for (int i = 0; i < nums.length; i++) {
//
//
//                    ans[i]=nums[nums[i]];
//
//
//        }
//        return ans;



//          int[] nums={0,2,1,5,3,4};
//          int[] ans=new int[6];
//
//          for (int i = 0; i < nums.length; i++) {
//              ans[i]=nums[nums[i]];
//
//          }
//          System.out.println(Arrays.toString(ans));


          //Through Functions/method

          int[]nums = {0,2,1,5,3,4};
          System.out.println(Arrays.toString(nums));
          int[]ans2=permutation(nums);
          System.out.println(Arrays.toString(ans2));

          
          
          
          

    }
    static int[] permutation (int[] nums){
        int[] ans=new int[6];
        for (int i = 0; i < nums.length; i++) {

            ans[i]=nums[nums[i]];
            
        }
        return ans;
    }

}