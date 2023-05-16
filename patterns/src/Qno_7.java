public class Qno_7 {
    public static void main(String[] args) {
        triangle(5);
    }
    static void triangle(int n){
        for (int i = 1; i <= n; i++) {

            int noofspaces=i;
            for (int j = 1; j < noofspaces; j++) {
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
