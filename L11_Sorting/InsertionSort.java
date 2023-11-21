import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("Insertion sort");
//        int[] arr = {3,1,4,5,2};
//        int[] arr = {5,3,4,1,2};
//        int[] arr = {10,8,6,3,1,4,9,7,5,2};
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] arr = {1};
//        int[] arr = {};
//        int[] arr = {-2,-1,-3,-8,-6};
        System.out.println("Before sort: " + Arrays.toString(arr));
        InsertionSort(arr);
    }

    public static void InsertionSort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = i+1; j > 0; j--)
            {
                if(arr[j-1] > arr[j])
                {
                    swap(arr, j-1, j);
                }
                else
                {
                    break;
                }
            }
            System.out.println("After iteration no. " + i + " --> " + Arrays.toString(arr));
        }
        System.out.println("After sort: " + Arrays.toString(arr));
    }

    public static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
