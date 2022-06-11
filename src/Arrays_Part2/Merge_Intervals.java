package Arrays_Part2;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge_Intervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3}, {2,6}, {8,10}, {15,18}};
        int[][] ans = merge(intervals);
        for(int[] a : ans){
            System.out.println(Arrays.toString(a));
        }
        System.out.println();
    }
    public static int[][] merge(int[][] intervals) {
        ArrayList<int[]> res = new ArrayList<>();

        if(intervals.length == 0 || intervals == null)
            return res.toArray(new int[0][]);

        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int[] i : intervals){
            if(i[0] <= end){
                end = Math.max(end, i[1]);
            }else{
                res.add(new int[]{start, end});
                start = i[0];
                end = i[1];
            }
        }
        res.add(new int[]{start, end});
        return res.toArray(new int[0][]);

    }
}
