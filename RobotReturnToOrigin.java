public class RobotReturnToOrigin {
    public static void main(String[] args) {
        String moves = "aa";
        boolean out = (new RobotReturnToOrigin()).judgeCircle(moves);
        System.out.println(out);

    }
    public boolean judgeCircle(String moves) {
        int i = 0, j = 0, k =0;
        while ( k <  moves.length()){
            System.out.println("found: "+moves.charAt(k));
            if(moves.charAt(k) == 'U') i++;
            else if(moves.charAt(k) == 'D') i--;
            else if(moves.charAt(k) == 'R') j++;
            else if(moves.charAt(k) == 'L') j--;
            else return false;
            k++;
        }
        System.out.println("i "+ "= " + i + " j = " + j);
        if(i == 0 && j == 0){
            return true;
        }
        return false;
    }
}
