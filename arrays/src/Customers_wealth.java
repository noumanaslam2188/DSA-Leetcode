import java.util.Arrays;

public class Customers_wealth {
    public static void main(String[] args) {

//        int[] ac1={1,2,3};
//        int[] ac2={3,2,1};
//        int[] a1=new int[1];
//        int[] a2=new int[1];
//        int max=0;
//
//        for (int i = 0; i < 1; i++) {
//
//            for (int j = 0; j < ac1.length; j++) {
//
//                a1[i]+=ac1[j];
//                a2[i]+=ac2[j];
//                if(a1[i]>=a2[i]){
//                    max=a1[i];
//                }else {
//                    max=a2[i];
//                }
//
//            }
//
//
//
//        }
//        System.out.println(max);

        int[][] accounts={
                {1,2,3},
                {3,2,1}
        };
        int result=richest_customer(accounts);
        System.out.println(result);



    }
    static int richest_customer(int[][] accounts){

        int maxwealth=0;


        for (int i = 0; i < accounts.length; i++) {
            int wealth=0;
            for (int j = 0; j < accounts[i].length; j++) {
                wealth+=accounts[i][j];

                maxwealth=Math.max(maxwealth,wealth);

            }
        }
        return maxwealth;
    }
}
