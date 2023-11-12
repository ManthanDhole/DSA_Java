import java.util.Arrays;
import java.lang.reflect.Array;
public class SelectionSort {
    public static void main(String[] args) {
        System.out.println("Selection sort");
//        int[] arr = {3,1,4,5,2};
//        int[] arr = {10,8,6,3,1,4,9,7,5,2};
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] arr = {1};
//        int[] arr = {};
//        int[] arr = {-2, -1, -3, -8, -6};

        System.out.println("Before sort: " + Arrays.toString(arr));
        SelectionSortAlgorithm(arr);
    }
    public static void SelectionSortAlgorithm(int[] arr)
    {
        int largest = arr[0];
        int indexOFLargest = 0;
        for(int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length - i; j++)
            {
                if(arr[j] > largest){
                    largest = arr[j];
                    indexOFLargest = j;
                }
            }
            int temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = largest;
            arr[indexOFLargest] = temp;
            largest = arr[0];
            indexOFLargest = 0;
            System.out.println("After iteration no. " + i + " --> " + Arrays.toString(arr));
        }
        System.out.println("After sort: " + Arrays.toString(arr));
    }
}
