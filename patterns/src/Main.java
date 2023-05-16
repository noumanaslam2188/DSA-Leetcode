public class Main {
    public static void main(String[] args) {
        int n=5;
        shape1(5);
        //System.out.println(n);
    }
    static void shape1(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}