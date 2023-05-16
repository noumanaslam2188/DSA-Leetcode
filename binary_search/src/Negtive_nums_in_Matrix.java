public class Negtive_nums_in_Matrix {
    public static void main(String[] args) {
        int[][] grid={
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
        };
        int ans=countNegatives(grid);
        System.out.println(ans);
    }
    static int countNegatives(int[][] grid){
        int m= grid.length;
        int n=grid[0].length;
        int count=0;
        int i=0;
        int j=n-1;

        while (i<m && j>=0){
            if(grid[i][j] <0){
                count+=m-i;
                j--;
            }
            else {
                i++;
            }
        }
        return count;
    }

}
