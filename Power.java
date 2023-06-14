public class Power {
    public static void main(String[] args) {
        double x = 2.0;
        int n = -2147483648;

        double out = new Power().myPow(x,n);
        System.out.println(out);

    }
    public double myPow(double x, int n) {
        if (x < -10000 || x > 10000) {
            return 0;
        }

        if(n==0){
            return 1;
        }
        double out = 0;
        if(n < 0){
             n = -n;
             x = 1/x;
        }
        if (n % 2 == 0) {
            return myPow(x * x, n / 2);
        }

        else{
            return  (x * myPow(x,--n));
        }

    }
}
