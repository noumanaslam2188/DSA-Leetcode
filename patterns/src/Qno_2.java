public class Qno_2 {
    public static void main(String[] args) {
       // int n=5;
        triangle(5);
    }
    static void triangle(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
