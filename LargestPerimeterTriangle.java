import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        int [] nums = {1,2,1,10};
        int out = new LargestPerimeterTriangle().largestPerimeter(nums);
        System.out.println(out);
    }
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        for(int i = nums.length - 3; i >= 0; i--) {
            if(nums[i] + nums[i + 1] > nums[i + 2])
                return nums[i] + nums[i + 1] + nums[i + 2];
        }
        return 0;
    }

}
