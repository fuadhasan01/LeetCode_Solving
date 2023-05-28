public class ValidAnagram {
    public static void main(String[] args) {
        ValidAnagram ob = new ValidAnagram();
        String s = "anagram";
        String t = "nagaram";
        boolean output = ob.isAnagram(s,t);
        System.out.println(output);
    }
    public boolean isAnagram(String s, String t) {
        int len1 = s.length();
        StringBuilder tOb = new StringBuilder(t);
        int len2 = tOb.length();
        System.out.println(tOb);
        int i = 0, j, flag;
        if(len1 == len2){

            for ( i = 0; i<len1; i++){
                flag = 0;
                for (j = 0 ; j<len2; j++){
                    if(s.charAt(i) == tOb.charAt(j)){
                        flag = 1;
                        tOb = tOb.deleteCharAt(j);
                        len2 = tOb.length();
                        System.out.println(tOb);
                        break;
                    }
                }
                if(flag == 0){
                    return false;
                }
            }
        }
        if(i==len1){
            return true;
        }
        return false;
    }
}
