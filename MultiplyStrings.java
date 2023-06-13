public class MultiplyStrings {
    public static void main(String[] args) {
        String num1 = "225", num2 = "3";
        System.out.println(new MultiplyStrings().multiply(num1,num2));

    }

    public String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] result = new int[m + n]; // Stores the intermediate products

        // Reverse the strings for easier computation
        String reversedNum1 = new StringBuilder(num1).reverse().toString();
        String reversedNum2 = new StringBuilder(num2).reverse().toString();

        // Perform multiplication digit by digit
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int digit1 = reversedNum1.charAt(i) - '0';
                int digit2 = reversedNum2.charAt(j) - '0';
                result[i + j] += digit1 * digit2;
            }
        }

        // Calculate the carry and the actual result digits
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for (int i = 0; i < result.length; i++) {
            int sum = result[i] + carry;
            int digit = sum % 10;
            carry = sum / 10;
            sb.append(digit);
        }

        // Remove leading zeroes from the result
        while (sb.length() > 1 && sb.charAt(sb.length() - 1) == '0') {
            sb.deleteCharAt(sb.length() - 1);
        }

        // Reverse the result string
        return sb.reverse().toString();
    }
}
