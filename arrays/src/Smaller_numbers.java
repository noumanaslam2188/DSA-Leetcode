import java.util.Arrays;

public class Smaller_numbers {
    public static void main(String[] args) {
        int[] nums={8,1,2,2,3};
        int ans=0;
        int[] result=new int[5];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]>nums[j]){
                    result[i]++;
                }

            }

        }
        System.out.println(Arrays.toString(result));
    }
}
