public class FindTheDifference {
    public static void main(String[] args) {
       String s = "b", t = "bb";
       char out = findTheDifference(s,t);
        System.out.println(out);
    }

    public static char findTheDifference(String s, String t) {
        char a = 0;
        StringBuilder sb = new StringBuilder(t);
        for(int i = 0; i<s.length(); i++){
//            System.out.println("s = " +s.charAt(i));
            for (int j = 0; j<t.length(); j++){
//                System.out.println("t = " +t.charAt(j));
                if(t.charAt(j) == s.charAt(i)){
                    String x = String.valueOf(t.charAt(j));
//                    System.out.println("x = "+x);
                    sb.deleteCharAt(j);
                    t = sb.toString();
                    break;
                }
            }

        }
        System.out.println(t.length());
        return t.charAt(t.length()-1);
    }
}
