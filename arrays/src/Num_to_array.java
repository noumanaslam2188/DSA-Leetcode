import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Num_to_array {
    public static void main(String[] args) {


        int[] num={1,2,0,0};
        int k=34;
        int n= num.length;
        int i=n-1;
        ArrayList<Integer> sol=new ArrayList<>();

        while (i>=0 || k>0){

            if(i>=0){

                sol.add((num[i]+k)%10);
                k=(num[i]+k)/10;
            }else {
                sol.add(k%10);
                k/=10;
            }
            i--;
        }
        Collections.reverse(sol);
        System.out.println(sol);


    }
}
