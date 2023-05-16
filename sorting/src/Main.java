import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,5,1};
       // bubble_sort(arr);
        selection(arr);
         System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last= arr.length-i-1;
         int mymax=getmax(arr,0,last);
         swap(arr,mymax,last);
        }
    }
    static int getmax(int[] arr,int start,int end){
        int max=start;
        for (int i = start; i <= end; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }

        }
        return max;
    }

    static void swap(int[] arr,int first,int second){

            int temp=arr[first];
            arr[first]=arr[second];
            arr[second]=temp;


    }
    static void bubble_sort(int[] arr){
            boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped=false;
            for (int j = 1; j < arr.length -i ; j++) {

                if(arr[j] < arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false){
                break;
            }
        }
    }
}