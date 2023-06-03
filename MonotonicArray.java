public class MonotonicArray {
    public static void main(String[] args) {
        int[] nums = {-5,-5,-5,-5,-2,-2,-2,-1,-1,-1,0};
        MonotonicArray ob = new MonotonicArray();
        boolean out = ob.isMonotonic(nums);
        System.out.println(out);
    }
    public boolean isMonotonic(int[] nums) {
        if(nums.length <= 1){
            return true;
        }

        int dif = nums[1] - nums[0];
        if(dif > 0){
            for (int i = 2; i<nums.length; i++){
                if(nums[i]-nums[i-1] < 0){
                    return false;
                }
            }
        }
        else if(dif==0){
            for (int i = 2; i<nums.length; i++){
                dif = nums[i] - nums[i-1];
                System.out.println(dif);
                if(dif > 0){
                    for (int j = i+1; j<nums.length; j++){
                        if(nums[j]-nums[j-1] < 0){
                            return false;
                        }
                    }
                }
                else if(dif < 0){
                    for (int j = i+1; j<nums.length; j++){
                        if(nums[j]-nums[j-1] > 0){
                            return false;
                        }
                    }
                }
            }
        }
        else{
            for (int i = 2; i<nums.length; i++){
                if(nums[i]-nums[i-1] > 0){
                    return false;
                }
            }
        }
        return true;
    }

}
