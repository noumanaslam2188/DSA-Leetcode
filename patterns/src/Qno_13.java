public class Qno_13 {
    public static void main(String[] args) {
        triangle(5);
    }
    static void triangle(int numRows){
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }
            if (i == numRows) {
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                if (i > 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
