public class Qno_9 {
    public static void main(String[] args) {
        triangle(5);
    }
    static void triangle(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j < i ; j++) {
                System.out.print(" ");
            }
            for (int j = 2*n-i; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
