public class Matrix_Diagonal_sum {
    public static void main(String[] args) {

        int[][] mat={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int sum=0;
        int n= mat.length;

        for (int i = 0; i < n; i++) {
            sum=sum+mat[i][i] + mat[i][n-i-1];

        }
        if(n/2==0){
            System.out.println(sum);
        }else {
            System.out.println(sum-mat[n/2][n/2]);
        }


    }
}
