//https://leetcode.com/problems/flipping-an-image/submissions/
//Flip the Array and then Inverse it
//Flip: Reverse the array => {[1 1 0]} => {[0 1 1]}
//Inverse: If 1 then invert it to 0 => {[1 1 0]} => {[0 0 1]}

import java.lang.reflect.Array;
import java.util.Arrays;

public class Flipping_anImage_GoogleQuestion {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 0, 1},
                {1, 1, 0},
                {0, 1, 1}
        };
//        System.out.println(Arrays.toString(arr));
        FlipTheArray(arr);
    }

    public static void FlipTheArray(int[][] arr)
    {
        for(int[] row : arr) {
            for (int i = 0; i < (arr[0].length + 1) / 2; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[arr[0].length - i - 1] ^ 1;
                row[arr[0].length - i - 1] = temp;
            }
            System.out.println(Arrays.toString(row));
        }
    }
}
