package Arrays_Part2;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String args[])
    {
        int m = 3 , n = 3;
        int[] a = new int[m + n];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        int[] b = {2 , 6 , 7};
        merge(a , m , b , n);
            System.out.print(Arrays.toString(a));
    }
    static void merge(int[] a , int m , int[] b , int n)
    {
        for(int i = 0 ; i < n ; i++)
            a[i + m] = b[i];
        Arrays.sort(a);
    }
}
