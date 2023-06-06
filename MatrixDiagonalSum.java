public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int [][] mat = {
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}
        };
        int out = (new MatrixDiagonalSum()).diagonalSum(mat);
        System.out.println(out);
    }
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int j;

        for(int i =0; i<mat.length; i++){
            j = mat.length - 1 - i;
            if(i==j){
                sum+=mat[i][j];
            }
            else sum += mat[i][i] + mat[i][j];

        }
        return sum;
    }


}
