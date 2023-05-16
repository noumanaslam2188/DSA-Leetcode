import java.util.Arrays;

public class Candies {
    public static void main(String[] args) {

        int[] candies={2,3,5,1,3};
        int[] result=new int[5];
        boolean[] r=new boolean[5];

//        for (int i = 0; i < candies.length; i++) {
//            result[i]=3+(candies[i]);
//
//            if(result[i]>4){
//                System.out.print("true"+" ");
//            }else {
//                System.out.print("false"+" ");
//            }

        for (int i = 0; i < candies.length; i++) {
            for (int j = 0; j < candies.length; j++) {

                if(candies[i]+3 >= candies[j]){
                    System.out.println(r);

                }else {
                    System.out.println(r);
                }

            }

        }
        System.out.println(Arrays.toString(r));



       // System.out.println(Arrays.toString(result));
    }
}
