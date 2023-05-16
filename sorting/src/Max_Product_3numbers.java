import java.util.Arrays;

public class Max_Product_3numbers {
    public static void main(String[] args) {

        int[] arr={-98,-100,-1,2,3,4};
        int ans=max_product(arr);
        System.out.println(ans);
       // int[] ans={20};



    }
    static int max_product(int[] arr){
        int ans=1;
        for (int i = arr.length-3; i < arr.length; i++) {
             ans *= arr[i];
        }
        return ans;
    }
}
