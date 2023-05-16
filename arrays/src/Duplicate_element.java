import java.lang.reflect.Array;
import java.util.Arrays;

public class Duplicate_element {
    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        int[] result=new int[nums.length];
        int rd=0;


        for (int i = 1; i < nums.length; i++) {



            if(result[rd] != nums[i]){

                result[rd]=nums[i];
                rd++;

            }

        }
        System.out.println(Arrays.toString(result));
    }
}
