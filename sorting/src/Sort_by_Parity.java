import java.util.Arrays;

public class Sort_by_Parity {
    public static void main(String[] args) {
        int[] nums={3,1,2,4};
        System.out.println(Arrays.toString(sort_through_parity(nums)));
    }
    static int[] sort_through_parity(int[] nums){
        int i=0;
        int j=nums.length-1;
        while(i<j){
            if(nums[i] % 2 > nums[j] % 2){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
            if(nums[i] % 2==0)i++;
            if(nums[j] % 2==1)j--;
        }
        return nums;
    }

}
