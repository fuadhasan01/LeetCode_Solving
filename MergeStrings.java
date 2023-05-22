public class MergeStrings {

}

class Solution {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "pq";
        String c = mergeAlternately(a,b);
        System.out.println(c);

    }
    public static String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        String out = "";
        if(len1==len2){
           for(int i= 0; i<len2; i++) {
               out = out + word1.charAt(i) + word2.charAt(i);
           }
        }
        else if(len1>len2){
            int i;
            for(i= 0; i<len2; i++) {
                out = out + word1.charAt(i) + word2.charAt(i);
            }
            out = out + word1.substring(i,len1);
        }
        else{
            int i;
            for(i= 0; i<len1; i++) {
                out = out + word1.charAt(i) + word2.charAt(i);
            }
            out = out + word2.substring(i,len2);
        }
        return out;
    }

}
