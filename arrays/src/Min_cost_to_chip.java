import java.util.Arrays;

public class Min_cost_to_chip {
    public static void main(String[] args) {

        int[] pos={1,2,3};
        int result=min_cost(pos);
        System.out.println(result);

    }
    static int min_cost(int[] pos){
        int even=0;
        int odd=0;

        for (int i = 0; i < pos.length; i++) {
            if (pos[i] % 2==0){
                even++;
            }else {
                odd++;
            }

        }
        return Math.min(even,odd);
    }
}
