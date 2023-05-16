public class Find_In_Mountain {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,1};
        int peak=peakInMountainArray(arr);
        int target=7;
        int firstry=binary_search(arr,target,0,peak);
        if(firstry != -1){
            System.out.println(firstry);
        }
        else {
            int ans=agnostic(arr,target,peak+1, arr.length-1);
            System.out.println(ans);
        }
    }
    static int peakInMountainArray(int[] arr){
        int s=0;
        int e=arr.length-1;

        while (s<e){
            int mid=s+(e-s)/2;

            if(arr[mid] < arr[mid+1]){
                s=mid+1;
            }
            else {
                e=mid;
            }
        }
        return s;
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
    static int agnostic(int[] arr,int target,int start,int end){

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
