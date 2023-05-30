public class MoveZero {
    public static void main(String[] args) {
        int [] nums = {0};
        MoveZero ob = new MoveZero();
        ob.moveZeroes(nums);
        for(int num:nums){
            System.out.println(num);
        }
    }
    public void moveZeroes(int[] nums) {
        int temp, temp2;
        int len = nums.length;
        for(int i = 0; i<len; i++){
            System.out.println(i);
            if(nums[i] == 0){
                System.out.println("found 0 and i = "+i);
                temp = nums[len - 1];
                nums[len - 1] = 0;
                if(len!=1){
                    for(int j = len-2; j>=i; j--){
                        temp2 = nums[j];
                        nums[j] = temp;
                        temp = temp2;

                    }
                    for(int num:nums){
                        System.out.print(num +" ");
                    }
                    System.out.println();
                }
                i = -1;
                len--;

            }
            else{
                System.out.println("Not found 0 and i = "+i);
                for(int num:nums){
                    System.out.print(num +" ");
                }
                System.out.println();
            }


        }
    }
}
