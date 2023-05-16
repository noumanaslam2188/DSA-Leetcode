public class Highest_Altitude {
    public static void main(String[] args) {
        int current=0;
        int max=0;

        int[] gain={-4,-3,-2,-1,4,3,2};

        for (int i = 0; i < gain.length; i++) {
            current+=gain[i];
            max=Math.max(max,current);

        }
        System.out.println(max);
    }
}
