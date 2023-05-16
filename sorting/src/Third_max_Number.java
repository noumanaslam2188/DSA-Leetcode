//import java.util.Arrays;
//
//public class Third_max_Number {
//    public static void main(String[] args) {
//    int[] nums={1,2,3,4,5};
//       // third_max(nums);
//        System.out.println(third_max(nums)) ;
//        //System.out.println(Arrays.toString(nums));
//    }
//    static int third_max(int[] nums){
//        int i=0;
//        int j=0;
//        for (i = 0; i < nums.length; i++) {
//            int last= nums.length-i-1;
//            int min=getmax(nums,0,last);
//            swap(nums,min,last);
//
//            }
//        for (int k = 0; k < nums.length-1; k++) {
//            if(nums[k] != nums[k+1]){
//                nums[j++]=nums[k];
//            }
//
//        }
//        return nums[2];
//    }
//    static int getmax(int[] nums,int start,int end){
//        int min=start;
//        for (int i = start; i <= end; i++) {
//            if(nums[min] > nums[i])
//                min=i;
//        }
//        return min;
//    }
//    static void swap(int[] nums,int first,int second){
//        int temp=nums[first];
//        nums[first]=nums[second];
//        nums[second]=temp;
//    }
//
//}
