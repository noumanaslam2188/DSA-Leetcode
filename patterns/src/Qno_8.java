public class Qno_8 {
    public static void main(String[] args) {
        triangle(5);
    }
    static void triangle(int n){
        for (int i = 1; i <= n ; i++) {

            for (int j = 0; j < n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i*2-1; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
