public class Qno_12 {
    public static void main(String[] args) {
        double_triangle(5);
    }
    static void double_triangle(int n){
        for (int row = 0; row < 2*n ; row++) {

            int col_at_row= row < n ? n - row : row - n;
            int spaces=row < n ? row : n - col_at_row;

            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }


            for (int col = 0; col < col_at_row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
