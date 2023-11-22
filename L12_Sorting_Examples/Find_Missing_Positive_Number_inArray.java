//https://leetcode.com/problems/first-missing-positive/

import java.util.Arrays;

public class Find_Missing_Positive_Number_inArray {
    public static void main(String[] args) {
//        int[] arr = {2,1,3,5,4,5};
//        int[] arr = {1,0,2};
        int[] arr = {1,1};
        System.out.println("Initial Array Elements: " + Arrays.toString(arr));
        CycleSortAlgorithm(arr);
        System.out.println("Final Array Elements: " + Arrays.toString(arr));

        int missingNumber = FindMissingNumber(arr);
        System.out.println("The Mismatch number is: " + missingNumber);
    }

    public static int FindMissingNumber(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            int expectedNumber = i+1;
            if(arr[i] != expectedNumber)
            {
                return  expectedNumber;
            }
        }
        return arr[arr.length-1] + 1;
    }
    public static void CycleSortAlgorithm(int[] arr)
    {
        int i = 0;
        while(i < arr.length)
        {
            int correctIndex = arr[i] - 1;
            int currentIndex = i;
            if(currentIndex != correctIndex && correctIndex >= 0 && correctIndex < arr.length && arr[currentIndex] != arr[correctIndex])
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
