public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello";
        LengthOfLastWord ob = new LengthOfLastWord();
        int out = ob.lengthOfLastWord(s);
        System.out.println(out);
    }
    public int lengthOfLastWord(String s) {
        String [] arr = s.split(" ");
        return arr[arr.length-1].length();
    }
}
