import java.util.Arrays;

public class Reshape_Matrix {
    public static void main(String[] args) {

        int[][] mat={
                {1,2},
                {3,4}
        };
        int n=0;
        int[] arr=new int[4];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                arr[n]=mat[i][j];
                n++;
               //arr[i+1]=mat[i][j];
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
