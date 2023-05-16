import java.util.Arrays;

public class Majority_Element {
    public static void main(String[] args) {
        int[] nums={4,5,4,5,4,5,5,5,4};
        System.out.println(majority(nums));


    }
    static int majority(int[] nums){
        boolean swaped;
        int i=0;
        for ( i =0 ; i < nums.length; i++) {
            swaped=false;
            for (int j = 1; j < nums.length-i; j++) {
                if(nums[j] < nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                    swaped=true;
                }
            }
            if(!swaped){
                break;
            }

        }
    return nums[nums.length/2];

    }

}
