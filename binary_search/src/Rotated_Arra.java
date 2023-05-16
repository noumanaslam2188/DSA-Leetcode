import java.util.Arrays;

public class Rotated_Arra {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target=0;
        int ans=search(arr,target);
        System.out.println(ans);
    }

    static int search(int[] nums, int target) {
        int pivot=find_pivot(nums);

        if(pivot==-1){
            return binary_search(nums,target,0, nums.length);
        }

        if(nums[pivot]==target){
            return pivot;
        }
        if(target > nums[0]){
           return binary_search(nums,target,0,pivot-1);
        }

            return binary_search(nums,target,pivot+1, nums.length);
    }

    static int binary_search(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;

            if(target > arr[mid]){
                start=mid+1;
            }
            else if(target < arr[mid]){
                end=mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    static int find_pivot(int[] arr){
        int start=0;
        int end=arr.length;

        while (start<end){
            int mid=start+(end-start)/2;

            if(arr[mid] > arr[mid+1]){
                return mid;
            }

        }
        return -1;
    }
}
