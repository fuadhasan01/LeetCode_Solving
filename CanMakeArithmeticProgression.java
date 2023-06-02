import java.util.Arrays;

public class CanMakeArithmeticProgression {
    public static void main(String[] args) {
        int [] arr = {1};
        CanMakeArithmeticProgression ob = new CanMakeArithmeticProgression();
        boolean out = ob.canMakeArithmeticProgression(arr);
        System.out.println(out);
    }
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int i;
        if(arr.length == 0 || arr.length==1){
            return true;
        }
        int dif = arr[1] - arr[0];
        for( i = 2; i<arr.length; i++){

            if(arr[i] - arr[i-1] != dif){
                return false;
            }
        }
        return true;
    }
}
