public class RepeatedSubstring {
    public static void main(String[] args) {
        String s = "ab";
        RepeatedSubstring ob = new RepeatedSubstring();
        boolean out = ob.repeatedSubstringPattern(s);
        System.out.println(out);

    }
    public boolean repeatedSubstringPattern(String s) {
        int i , j, len = s.length();

            String test = "";
            if (len == 1){
                return false;
            }
            for(i = 0; i<len; i++){
                int flag = 0;
                test = test.concat(String.valueOf(s.charAt(i)));
                if(test.length() == len){
                    return false;
                }
                int len2 = test.length();
                for (j = i+1; j<len ; ){

                    System.out.println(test + " " + s.substring(j, j + len2));
                        if(j+len2 > len){
                            return false;
                        }
                        if(!test.equals(s.substring(j, j + len2))){
                            flag = 1;
                            break;
                        }
                        else{
                            flag = 0;
                        }



                    j = j+len2;
                }
                System.out.println(flag);
                if(flag == 0 && j == len+len2){
                    return true;
                }

            }


        return true;
    }
}
