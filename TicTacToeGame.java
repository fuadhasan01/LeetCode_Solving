import java.util.Arrays;

public class TicTacToeGame {
    public static void main(String[] args) {
        int [][] moves = {
                {0,0},
                {1,1}
        };
//        int [] [] arr = new int[10][10];
////        System.out.println(arr.length);
        String out = (new TicTacToeGame()).tictactoe(moves);
        System.out.println(out);

    }
    public String tictactoe(int[][] moves) {
        String [][] arr= new String[3][3];
        for(int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                arr[i][j] = "";
            }
        }
        for(int i = 0; i<moves.length; i++){
            int x = Integer.parseInt(String.valueOf(Arrays.toString(moves[i]).charAt(1)));
            int y = Integer.parseInt(String.valueOf(Arrays.toString(moves[i]).charAt(4)));
            if(i%2 == 0){
                arr[x][y] = "X";
            }
            else{
                arr[x][y] = "0";
            }
        }
        for(int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){

                if(arr[i][j] == "X"){
//                    System.out.println("Found X: ");
                    if(j+2 < 3 && arr[i][j+1] == "X" && arr[i][j+2] == "X"){
//                        System.out.println(arr[i][j+1]+" "+arr[i][j+2]);
                        return "A";
                    }
                    else if(j-2 > -1 && arr[i][j-1] == "X" && arr[i][j-2] == "X"){
//                        System.out.println(arr[i][j-1]+" "+arr[i][j-2]);
                        return "A";
                    }
                    else if(i+2 < 3 && arr[i+1][j] == "X" && arr[i+2][j] == "X"){
//                        System.out.println(arr[i+1][j]+" "+arr[i+2][j]);
                        return "A";
                    }
                    else if(i-2 > -1 && arr[i-1][j] == "X" && arr[i-2][j] == "X"){
//                        System.out.println(arr[i+1][j]+" "+arr[i+2][j]);
                        return "A";
                    }
                    else if(j+2 < 3 && i+2 < 3 && arr[i+1][j+1] == "X" && arr[i+2][j+2] == "X"){
//                        System.out.println(arr[i+1][j+1]+" "+arr[i+2][j+2]);
                        return "A";
                    }
                    else if(j-2 > -1 && i-2 > -1 && arr[i-1][j-1] == "X" && arr[i-2][j-2] == "X"){
//                        System.out.println(arr[i-1][j-1]+" "+arr[i-2][j-2]);
                        return "A";
                    }
                    else if(j+2 < 3 && i-2 > -1 && arr[i-1][j+1] == "X" && arr[i-2][j+2] == "X"){
//                        System.out.println(arr[i-1][j+1]+" "+arr[i-2][j+2]);
                        return "A";
                    }
                    else if(j-2 > -1 && i+2 < 3 && arr[i+1][j-1] == "X" && arr[i+2][j-2] == "X"){
//                        System.out.println(arr[i+1][j-1]+" "+arr[i+2][j-2]);
                        return "A";
                    }

                }
                else if(arr[i][j] == "0"){
//                    System.out.println("Found 0: ");
                    if(j+2 < 3 && arr[i][j+1] == "0" && arr[i][j+2] == "0"){
//                        System.out.println(arr[i][j+1]+" "+arr[i][j+2]);
                        return "B";
                    }
                    else if(j-2 > -1 && arr[i][j-1] == "0" && arr[i][j-2] == "0"){
//                        System.out.println(arr[i][j-1]+" "+arr[i][j-2]);
                        return "B";
                    }
                    else if(i+2 < 3 && arr[i+1][j] == "0" && arr[i+2][j] == "0"){
//                        System.out.println(arr[i+1][j]+" "+arr[i+2][j]);
                        return "B";
                    }
                    else if(j+2 < 3 && i+2 < 3 && arr[i+1][j+1] == "0" && arr[i+2][j+2] == "0"){
//                        System.out.println(arr[i+1][j+1]+" "+arr[i+2][j+2]);
                        return "B";
                    }
                    else if(j-2 > -1 && i-2 > -1 && arr[i-1][j-1] == "0" && arr[i-2][j-2] == "0"){
//                        System.out.println(arr[i-1][j-1]+" "+arr[i-2][j-2]);
                        return "B";
                    }
                    else if(j+2 < 3 && i-2 > -1 && arr[i-1][j+1] == "0" && arr[i-2][j+2] == "0"){
//                        System.out.println(arr[i-1][j+1]+" "+arr[i-2][j+2]);
                        return "B";
                    }
                    else if(j-2 > -1 && i+2 < 3 && arr[i+1][j-1] == "0" && arr[i+2][j-2] == "0"){
//                        System.out.println(arr[i+1][j-1]+" "+arr[i+2][j-2]);
                        return "B";
                    }

                }
            }
        }
        if(moves.length<9){
            return "Pending";
        }
        return "Draw";
    }
}
