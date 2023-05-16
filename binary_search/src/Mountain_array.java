public class Mountain_array {
    public static void main(String[] args) {
        int[] arr={0,1,0};
        int ans=peakInMountainArray(arr);
        System.out.println(ans);
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

}
