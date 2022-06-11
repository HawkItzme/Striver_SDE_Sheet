package Arrays_Part2;

import java.util.Arrays;

public class Rotate_Image {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3}, {4,5,6}, {7,8,9}};
        rotate(mat);
        for(int[] a : mat){
            System.out.println(Arrays.toString(a));
        }

    }
    public static void rotate(int[][] mat) {
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < i; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        int s = 0;
        int e = mat.length - 1;
        while(s <= e){
            for(int i = 0; i < mat.length; i++){
                int temp = mat[i][s];
                mat[i][s] = mat[i][e];
                mat[i][e] = temp;
            }
            s++;
            e--;
        }
    }
}
