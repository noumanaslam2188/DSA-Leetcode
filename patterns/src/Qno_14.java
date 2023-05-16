public class Qno_14 {
    public static void main(String[] args) {
        triangle(5);
    }
    static void triangle(int n){
        for (int i = 1; i <= n ; i++) {

            if(i==1){
                for (int j = 1; j <=2*n-1 ; j++) {
                    System.out.print("*");
                }

            }else {
                for (int j =2 ; j <=i ; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 2; j <= 2*n -(2*i)  ; j++) {
                    System.out.print(" ");
                }
                if(i < n){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
