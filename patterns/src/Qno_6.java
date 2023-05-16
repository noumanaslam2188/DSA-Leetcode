public class Qno_6 {
    public static void main(String[] args) {
        // int n=5;
        triangle(5);
    }
    static void triangle(int n){
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            for (int k =1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        //2nd code

//        for (int i = 1; i <= n; i++) {           //for (int i = 1; i <= n; i++) {
//
//            for (int j = 1; j <= n - i; j++) {    for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
