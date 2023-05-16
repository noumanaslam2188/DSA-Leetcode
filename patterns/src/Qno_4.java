public class Qno_4 {
    public static void main(String[] args) {
        number_triangle(5);
    }
    static void number_triangle(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
