public class Fiboncci_series {
    public static void main(String[] args) {

        int f=0;
        int s=1;

        int n=50;

        for(int i=3; i<=n; i++){
            int total=f+s;

            System.out.println(total);
            f=s;
            s=total;

        }
    }
}
