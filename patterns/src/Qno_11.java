public class Qno_11 {
    public static void main(String[] args) {
        triangle(5);
    }
    static void triangle(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(" ");
            }
            for (int j = n; j >=i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
