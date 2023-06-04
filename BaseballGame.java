public class BaseballGame {
    public static void main(String[] args) {
        String [] operations = {"5","2","C","D","+"};
        BaseballGame ob = new BaseballGame();
        int out = ob.calPoints(operations);
        System.out.println(out);
    }
    public int calPoints(String[] operations) {
        int [] arr = new int[operations.length];
        int j = 0;
        for(int i = 0; i<operations.length; i++){
            if(operations[i].matches("-?\\d+(\\.\\d+)?")){
                arr[j++] = Integer.parseInt(operations[i]);
            }
            else if(operations[i].equals("+")){
                if(arr.length==1){
                    arr[j++] = arr[0];
                }
                else if(arr.length == 0){
                    continue;
                }
                else{
//
                    int x = arr[j-1], y = arr[j-2];
                    arr[j++] = x + y;

                }
            }
            else if(operations[i].equals("D")){
                if(arr.length == 0){
                    continue;
                }
                else {
                    int dValue = arr[j-1];
                    arr[j++] = 2 * dValue;
                }
            }
            else if(operations[i].equals("C")){
                if(arr.length == 0){
                    continue;
                }
                else {
                    j--;
                }
            }

        }
        int sum = 0;
        for(int k = 0; k<j; k++){
            sum+=arr[k];
        }
        return sum;
    }
}
