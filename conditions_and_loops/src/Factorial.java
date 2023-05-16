public class Factorial {
    public static void main(String[] args) {

        int f=5;
        int r=1;
        while (f>=1){
            r=r*f;

            f--;
        }
        System.out.println(r);
    }
}
