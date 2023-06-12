public class AddBinary1 {
    public static void main(String[] args) {
        String a = "1", b = "10000";
        System.out.println(new AddBinary1().addBinary(a,b));
    }
    public String addBinary(String a, String b) {
        String sum = "";
        String carry = "0";
        if(a.length()>=b.length()){
            int diff = a.length() - b.length();
            for (int i = a.length()-1; i>-1; i--){
                if(i+1-diff-1 >= 0){
                    if(a.charAt(i) == '1' && b.charAt(i+1-diff-1) == '1'){
                        if(i>0){
                            if(carry == "0"){
                                sum+="0";
                                carry = "1";
                            }
                            else {
                                sum +="1";
                                carry = "1";
                            }
                        }
                        else{
                            if(carry == "0"){
                                sum+="01";
                            }
                            else {
                                sum +="11";
                            }
                        }
                    }
                    else if(a.charAt(i) == '0' && b.charAt(i+1-diff-1) == '0'){
                        if(i>0){
                            if(carry == "0"){
                                sum+="0";
                                carry = "0";
                            }
                            else {
                                sum +="1";
                                carry = "0";
                            }
                        }
                        else{
                            if(carry == "0"){
                                sum+="0";
                            }
                            else {
                                sum +="1";
                            }
                        }
                    }
                    else {
                        if(i>0){
                            if(carry == "0"){
                                sum+="1";
                                carry = "0";
                            }
                            else {
                                sum +="0";
                                carry = "1";
                            }
                        }
                        else{
                            if(carry == "0"){
                                sum+="1";
                            }
                            else {
                                sum +="01";
                            }
                        }
                    }
                }
                else{
                    if(a.charAt(i) == '1'){
                        if(i>0){
                            if(carry == "1"){
                                sum+="0";
                                carry = "1";
                            }
                            else {
                                sum+="1";
                                carry = "0";
                            }
                        }
                        else {
                            if(carry == "1"){
                                sum+="01";
                            }
                            else {
                                sum+="1";
                            }
                        }
                    }
                    else if(a.charAt(i) == '0'){
                        if(i>0){
                            if(carry == "1"){
                                sum+="1";
                                carry = "0";
                            }
                            else {
                                sum+="0";
                                carry = "0";
                            }
                        }
                        else {
                            if(carry == "1"){
                                sum+="1";
                            }
                            else {
                                sum+="0";
                            }
                        }
                    }
                }

            }
        }
        else {
            int diff = b.length() - a.length();
            for (int i = b.length()-1; i>-1; i--){
                if(i+1-diff-1 >= 0){
                    if(a.charAt(i+1-diff-1) == '1' && b.charAt(i) == '1'){
                        if(i>0){
                            if(carry == "0"){
                                sum+="0";
                                carry = "1";
                            }
                            else {
                                sum +="1";
                                carry = "1";
                            }
                        }
                        else{
                            if(carry == "0"){
                                sum+="01";
                            }
                            else {
                                sum +="11";
                            }
                        }
                    }
                    else if(a.charAt(i+1-diff-1) == '0' && b.charAt(i) == '0'){
                        if(i>0){
                            if(carry == "0"){
                                sum+="0";
                                carry = "0";
                            }
                            else {
                                sum +="1";
                                carry = "0";
                            }
                        }
                        else{
                            if(carry == "0"){
                                sum+="0";
                            }
                            else {
                                sum +="1";
                            }
                        }
                    }
                    else {
                        if(i>0){
                            if(carry == "0"){
                                sum+="1";
                                carry = "0";
                            }
                            else {
                                sum +="0";
                                carry = "1";
                            }
                        }
                        else{
                            if(carry == "0"){
                                sum+="1";
                            }
                            else {
                                sum +="01";
                            }
                        }
                    }
                }
                else{
                    if(b.charAt(i) == '1'){
                        if(i>0){
                            if(carry == "1"){
                                sum+="0";
                                carry = "1";
                            }
                            else {
                                sum+="1";
                                carry = "0";
                            }
                        }
                        else {
                            if(carry == "1"){
                                sum+="01";
                            }
                            else {
                                sum+="1";
                            }
                        }
                    }
                    else if(b.charAt(i) == '0'){
                        if(i>0){
                            if(carry == "1"){
                                sum+="1";
                                carry = "0";
                            }
                            else {
                                sum+="0";
                                carry = "0";
                            }
                        }
                        else {
                            if(carry == "1"){
                                sum+="1";
                            }
                            else {
                                sum+="0";
                            }
                        }
                    }
                }
            }
        }
        StringBuilder reversed = new StringBuilder(sum);
        reversed.reverse();
        return reversed.toString();
    }
}
