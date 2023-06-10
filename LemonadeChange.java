import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LemonadeChange {
    public static void main(String[] args) {
        int[] bills = {5,5,10,20,5,5,5,5,5,5,5,5,5,10,5,5,20,5,20,5};
        boolean out = (new LemonadeChange()).lemonadeChange(bills);
        System.out.println(out);
    }
    public boolean lemonadeChange(int[] bills) {
        List<Integer> payBillList = new ArrayList<>();
        for(int i = 0; i<bills.length; i++){
            if(bills[i]==5){
                payBillList.add(5);
            }
            else if(bills[i]==10){
                if(payBillList.contains(5)){
                    payBillList.remove((Integer) 5);
                }
                else {
                    return false;
                }
                payBillList.add(10);
            }
            else if(bills[i] == 20){
                if(payBillList.contains(5) && payBillList.contains(10)){
                    payBillList.remove((Integer) 5);
                    payBillList.remove((Integer) 10);
                }
                else if(Collections.frequency(payBillList, 5) >= 3){
                    payBillList.remove((Integer) 5);
                    payBillList.remove((Integer) 5);
                    payBillList.remove((Integer) 5);
                }
                else {
                    return false;
                }
                payBillList.add(20);
            }
        }
        return true;
    }
}
