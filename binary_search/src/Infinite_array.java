public class Infinite_array {
    public static void main(String[] args) {
        int[] arr={12,13,15,17,75,76,78,89,344};
        int target=76;
        System.out.println(ans(arr,target));

    }

    static int ans(int[] arr,int target){
        int start=0;
        int end=1;

        while (target > arr[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return binary_search(arr,target,start,end);
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
}
