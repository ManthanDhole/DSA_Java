import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Bubble sort");
//        int[] arr = {3,1,4,5,2};
//        int[] arr = {10,8,6,3,1,4,9,7,5,2};
//        int[] arr = {10,9,8,7,6,5,4,3,2,1};
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] arr = {1};
//        int[] arr = {};
        int[] arr = {-2,-1,-3,-8,-6};

        System.out.println("Before sort: " + Arrays.toString(arr));
        BubbleSortAlgorithm(arr);

    }
    public static void BubbleSortAlgorithm(int[] arr)
    {
        int count = 0;
        boolean swapped = false;
        for(int i = 0; i < arr.length; i++) {
            count++;
            //Iterate through each element, compare adjacent elements and swap if previous is larger
            for (int j = 1; j < arr.length-i; j++) {
                count++;
                //Basic Swap
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            System.out.println("After iteration no. " + i + " --> " + Arrays.toString(arr));
            //If the array is already swapped in the first iteration, the no need to execute further
            if(!swapped)
            {
                break;
            }
        }
        System.out.println("After sort: " + Arrays.toString(arr));
        System.out.println("Max comparisons: " + count);
    }
}

