import java.util.Arrays;

public class Contains_Duplicate {
    public static void main(String[] args) {
        int[] nums={1,2,3,2};
        selection(nums);
        System.out.println(Arrays.toString(nums));

       // System.out.println(singleNonDuplicate(nums));
    }
    static boolean selection(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int last= nums.length-i-1;
            int mymax=getmax(nums,0,last);
            swap(nums,mymax,last);

        }
        return singleNonDuplicate(nums);

    }
    static int getmax(int[] nums,int start,int end){
        int max=start;
        for (int i = 0; i <= end; i++) {
            if(nums[max]<nums[i]){
                max=i;
            }

        }
        return max;
    }

    static void swap(int[] nums,int first,int second){
            int temp=nums[first];
            nums[first]=nums[second];
            nums[second]=temp;


    }

    static boolean singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            boolean halvesAreEven = (right - mid) % 2 == 0;
            if (nums[mid] == nums[mid + 1]) {
                if (halvesAreEven) {
                    left = mid + 2;
                } else {
                    right = mid - 1;
                }
            } else if (nums[mid] == nums[mid - 1]) {
                if (halvesAreEven) {
                    right = mid - 2;
                } else {
                    left = mid + 1;
                }
            } else {
                return false;//nums[mid];
            }
        }

        return true;//nums[left];
    }

}
