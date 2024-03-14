public class RemoveElement {
    public static void main(String[] args) {
        int [] arr = {0,1,2,2,3,0,4,2};
        int out = removeElement(arr,2);

        System.out.println(out);
    }
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        int i = 0;
        while (i<nums.length){
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
            i++;
        }

        return count;
    }
}
