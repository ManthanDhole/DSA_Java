//https://leetcode.com/problems/missing-number/description/
import java.util.Arrays;
public class Find_missing_number_using_CyclicSort {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
//        int[] arr = {4,0,2,1};
//        int[] arr = {0,1};
        System.out.println("Initial Array Elements: " + Arrays.toString(arr));
        CycleSortAlgorithm(arr);
        System.out.println("Final Array Elements: " + Arrays.toString(arr));

        int missingNumber = FindMissingNumber(arr);
        System.out.println("The missing number is: " + missingNumber);
    }
    public static int FindMissingNumber(int[] arr)
    {
        //case 1: If the missing element is in between the array
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] != i)
            {
                return i;
            }
        }
        //case 2: If the missing element is in the end of the array || If the last element of the array is missing
        //This return is placed in order to denote that the last element of the array is not present
//        n = 2
//        Given Array => [0,1]
//        Expected Array => [0,1,2]
        return arr.length;
    }

    //Sort using while loop
//    public static void CycleSortAlgorithm(int[] arr)
//    {
//        int i = 0;
//        while(i < arr.length)
//        {
//            int correctIndex = arr[i];
//            int currentIndex = i;
//            //correctIndex must be less than the length of the array or else it will give index out of bound exception
//            if( correctIndex < arr.length && currentIndex != correctIndex)
//            {
//                swap(arr, currentIndex, correctIndex);
//            }
//            else
//            {
//                i++;
//            }
//        }
//    }

    //Sort using For loop
    public static void CycleSortAlgorithm(int[] arr)
    {

        for(int i = 0; i < arr.length; i++)
        {
//            START_AGAIN:
            int expectedIndex =  arr[i];
            int currentIndex = i;

            if(currentIndex != expectedIndex && expectedIndex < arr.length)
            {
                swap(arr, currentIndex, expectedIndex);
                //This i-- will again check the element at the same index, if it has the incorrect index, then the loop
                //will again execute with the same index until we get the correct element.
                i--;
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
