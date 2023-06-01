public class SignOfTheProduct {
    public static void main(String[] args) {
        int [] nums = {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
        SignOfTheProduct ob = new SignOfTheProduct();
        int out = ob.arraySign(nums);
        System.out.println(out);
    }
    public int arraySign(int[] nums) {
        int countNeg = 0;
        for (int num : nums){
            if(num<0){
                countNeg++;
            }
            else if(num == 0){
                return 0;
            }
        }
        System.out.println(countNeg);
        return signFunc(countNeg);
    }
    public int signFunc(int countNeg){
        return countNeg%2== 0?  1 : -1;

    }
}
