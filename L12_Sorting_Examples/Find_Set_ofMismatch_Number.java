//https://leetcode.com/problems/set-mismatch/
import java.util.ArrayList;
import java.util.Arrays;

public class Find_Set_ofMismatch_Number {
    public static void main(String[] args) {
//        int[] arr = {9,6,4,2,3,7,10,1};
//        int[] arr = {4,3,2,7,8,2,3,1};
//        int[] arr = {4,2,1};
        int[] arr = {2,1,3,5,4,5};
        System.out.println("Initial Array Elements: " + Arrays.toString(arr));
        CycleSortAlgorithm(arr);
        System.out.println("Final Array Elements: " + Arrays.toString(arr));

        int[] mismatchNumber = FindMissingNumber(arr);
        System.out.println("The Mismatch number is: " + Arrays.toString(mismatchNumber));
    }

    public static int[] FindMissingNumber(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            int expectedNumber = i+1;
            if(arr[i] != expectedNumber)
            {
                //Just check the element at the index. If it isn't according to the cyclic sorted pattern
                //then it is the number which have been duplicated.
                return new int[] {arr[i], expectedNumber};
            }
        }
        return new int[] { -1, -1 };
    }
    public static void CycleSortAlgorithm(int[] arr)
    {
        int i = 0;
        while(i < arr.length)
        {
            int correctIndex = arr[i]-1;
            int currentIndex = i;
            //correctIndex must be less than the length of the array or else it will give index out of bound exception
            //additional check is required for duplicate numbers in the array before swapping
            if( correctIndex < arr.length && currentIndex != correctIndex && arr[correctIndex] != arr[currentIndex])
            {
                swap(arr, currentIndex, correctIndex);
            }
            else
            {
                i++;
            }
        }
    }
    public static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
