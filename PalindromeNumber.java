// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class PalindromeNumber {
    public static void main(String[] args) {
        boolean isPalindrome = isPalindrome(10);
        System.out.println(isPalindrome);

    }

    public static boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        int a = 0;
        int b = s.length()-1;

        while(b>=a){
            if(s.charAt(a) != s.charAt(b)){
                return false;
            }
            a++;
            b--;
        }

        return true;
    }
}