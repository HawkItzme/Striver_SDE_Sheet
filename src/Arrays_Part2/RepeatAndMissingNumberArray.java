package Arrays_Part2;

import java.util.Arrays;

public class RepeatAndMissingNumberArray {
    public static void main(String[] args) {
     int[] arr = {3, 1, 2, 5, 3};
        System.out.println(Arrays.toString(repeatedNumber(arr
        )));
    }
    public static int[] repeatedNumber(final int[] arr) {
        int[] ans = new int[2];
        int i = 0;
        while (i < arr.length) {
            if(arr[i] != i + 1){
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    int temp = arr[i];
                    arr[i] = arr[correct];
                    arr[correct] = temp;
                }else
                    i++;
            }else{
                i++;
            }
        }
        int j = 0;
        for(int p = 0; p < arr.length; p++){
            if(arr[p] != p + 1){
                ans[j] = arr[p];
                ans[j + 1] = p + 1;
            }
        }
        return ans;
    }
}
