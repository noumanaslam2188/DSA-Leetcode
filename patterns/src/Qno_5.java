public class Qno_5 {
    public static void main(String[] args) {
        double_triangle(5);
    }
    static void double_triangle(int n){
        int i=1;

            for ( i = 1; i < 2*n; i++) {
                int column_at_each_row=i > n ? 2*n - i  : i;
                for (int j = 1; j <= column_at_each_row; j++) {
                    System.out.print("* ");
                }
                System.out.println();
                }

            }


    }

