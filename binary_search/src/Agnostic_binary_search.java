public class Agnostic_binary_search {
    public static void main(String[] args) {
        //int[] nums={-10,-5,0,2,4,7,89,90,100};
        int[] nums={90,89,67,56,43,21,12};
        int target=56;
        int ans=agnostic(nums,target);
        System.out.println(ans);
    }
    static int agnostic(int[] arr,int target){
        int start=0;
        int end= arr.length-1;
        boolean isAsc=(arr[start] < arr[end]);


        while (start <= end){
            int mid=start+(end-start)/2;

            if (target==arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end=mid-1;
                } else if (target > arr[mid]) {
                    start=mid+1;
                }
            }
            else {
                if(target < arr[mid]){
                    start=mid+1;
                } else if (target > arr[mid]) {
                    end=mid-1;
                }

            }
        }
        return -1;


    }
}
