public class RichestCustomerWealth {
    public static void main(String[] args) {
        int [][] accounts = {
                {1,5},
                {7,3},
                {3,5}
        };
        int out = (new RichestCustomerWealth()).maximumWealth(accounts);
        System.out.println(out);
    }
    public int maximumWealth(int[][] accounts) {
        if(accounts.length==0){
            return 0;
        }
        int maximumAmount = 0;

        for(int i = 0; i<accounts.length; i++){
            int count = 0;
            for(int j = 0; j<accounts[i].length; j++){
                count +=accounts[i][j];
            }
            if(count>maximumAmount){
                maximumAmount = count;
            }
        }
        return maximumAmount;
    }
}
