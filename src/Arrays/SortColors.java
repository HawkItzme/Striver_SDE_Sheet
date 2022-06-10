package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] nums) {
        if(nums.length == 0 && nums.length == 1)
            return;
        int start = 0;
        int end = nums.length - 1;
        int i = 0;
        while(i <= end && start < end){
            if(nums[i] == 0){
                nums[i] = nums[start];
                nums[start] = 0;
                start++;
                i++;
            }else if(nums[i] == 2){
                nums[i] = nums[end];
                nums[end] = 2;
                end--;
            }else
                i++;
        }
    }
}
