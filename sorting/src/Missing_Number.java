import java.util.Arrays;

public class Missing_Number {
    public static void main(String[] args) {
        int[] arr={3,0,1};
        int ans=cyclic(arr);
        System.out.println(ans);
    }
    static int cyclic(int[] arr){
        int i=0;
        while ( i< arr.length){
            int rightindex=arr[i];

            if(arr[i] <arr.length && arr[i] != arr[rightindex]){
                swap(arr,i,rightindex);
            }

            else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] !=index){
                return index;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr,int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
