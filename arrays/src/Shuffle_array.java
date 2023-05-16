import java.util.Arrays;

public class Shuffle_array {
    public static void main(String[] args) {

        int[] nums={2,5,1,3,4,7};
        int[] ans=new int[6];
        int j=0;

        for (int i = 0; i < 6; i=i+2) {
            ans[i]=nums[j];
            ans[i+1]=nums[j+3];
            j++;

        }
        System.out.println(Arrays.toString(ans));
    }
}
