import java.util.ArrayList;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int [][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        new SetMatrixZeroes().setZeroes(matrix);
    }
    public void setZeroes(int[][] matrix) {
        ArrayList<Pair> PairList = new ArrayList<>();
        for(int i =0 ; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                if(matrix[i][j]==0){
                    PairList.add(new Pair(i,j));
                }
            }
        }
        for(int k = 0 ; k<PairList.size(); k++){
            int i = PairList.get(k).i;
            int j = PairList.get(k).j;

                int x = i;
                while (x!=matrix.length){
                    matrix[x][j] = 0;
                    x++;
                }
                x = i;
                while (x!=-1){
                    matrix[x][j] = 0;
                    x--;
                }


                x = j;
                while (x!=matrix[i].length){
                    matrix[i][x] = 0;
                    x++;
                }
                x = j;
                while (x!=-1){
                    matrix[i][x] = 0;
                    x--;
                }

        }

        for(int i = 0; i<matrix.length; i++){
            for (int j = 0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class Pair {
    int i;
    int j;
    public Pair(int i, int j){
        this.i = i;
        this.j = j;
    }
}
