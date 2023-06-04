public class ToLowerCase {
    public static void main(String[] args) {
        String s = "here";
        ToLowerCase ob = new ToLowerCase();
        String out = ob.toLowerCase(s);
        System.out.println(out);
    }
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }
}
