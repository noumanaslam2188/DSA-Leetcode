public class Qno_3 {
    public static void main(String[] args) {
        triangle(5);
    }
    static void triangle(int n){
        for (int i = 1; i <= n; i++) {
            for (int j =5 ; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
