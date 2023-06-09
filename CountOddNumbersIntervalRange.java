public class CountOddNumbersIntervalRange {
    public static void main(String[] args) {
        int low = 3, high = 8;
        int out = (new CountOddNumbersIntervalRange()).countOdds(low,high);
        System.out.println(out);
    }
    public int countOdds(int low, int high) {
        int count = 0;
        if(low%2!=0 && high%2!= 0){
            count = ((high - low)/2) + 1;
        }
        else if(low%2!=0 && high%2 == 0){
            count = ((high - low)/2) + 1;
        }
        else if(low%2==0 && high%2 != 0){
            count = ((high - low)/2) + 1;
        }
        else {
            count = ((high - low)/2);
        }


        return count;
    }
}
