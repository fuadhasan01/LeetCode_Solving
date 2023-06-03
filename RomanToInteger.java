public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIX";
        RomanToInteger ob = new RomanToInteger();
        int out = ob.romanToInt(s);
        System.out.println(out);
    }
    public int romanToInt(String s) {
        int count = 0;
        if(s.length() <= 1){
            if(s.charAt(s.length()-1) == 'I'){
                return 1;
            }
            else if(s.charAt(s.length()-1) == 'V'){
                return 5;
            }
            else if(s.charAt(s.length()-1) == 'X'){
                return 10;
            }
            else if(s.charAt(s.length()-1) == 'L'){
                return 50;
            }
            else if(s.charAt(s.length()-1) == 'C'){
                return 100;
            }
            else if(s.charAt(s.length()-1) == 'D'){
                return 500;
            }
            else if(s.charAt(s.length()-1) == 'M'){
                return 1000;
            }
        }


        for(int i = 0; i<s.length(); ){

            if(s.charAt(i) == 'I'){
                if(i+1 <= s.length()-1 && s.charAt(i+1) == 'V'){
                    count = count + 4;
                    i = i + 2;
                }
                else if(i+1 <= s.length()-1 && s.charAt(i+1) == 'X' ){
                    count = count + 9;
                    i = i+2;
                }
                else{
                    count++;
                    i++;
                }
            }
            else if(s.charAt(i) == 'V'){
                count+=5;
                i++;
            }
            else if(s.charAt(i) == 'X'){
                if(i+1 <= s.length()-1 && s.charAt(i+1) == 'L'){
                    count = count + 40;
                    i = i + 2;
                }
                else if(i+1 <= s.length()-1 && s.charAt(i+1) == 'C'){
                    count = count + 90;
                    i = i+2;
                }
                else{
                    count = count + 10;
                    i++;
                }
            }
            else if(s.charAt(i) == 'L' ){
                count+=50;
                i++;
            }
            else if(s.charAt(i) == 'C'){
                if(i+1 <= s.length()-1 && s.charAt(i+1) == 'D' ){
                    count = count + 400;
                    i = i + 2;
                }
                else if(i+1 <= s.length()-1 && s.charAt(i+1) == 'M' ){
                    count = count + 900;
                    i = i+2;
                }
                else{
                    count = count + 100;
                    i++;
                }
            }
            else if(s.charAt(i) == 'D'){
                count+=500;
                i++;
            }
            else if(s.charAt(i) == 'M'){
                count+=1000;
                i++;
            }
//            System.out.println(count);
        }
        return count;
    }
}
