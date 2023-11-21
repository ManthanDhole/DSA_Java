import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        System.out.println("Cycle sort");
//        int[] arr = {3,1,4,5,2};
        int[] arr = {10,8,6,3,1,4,9,7,5,2};
//        int[] arr = {10,9,8,7,6,5,4,3,2,1};
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] arr = {1};
//        int[] arr = {};
//        int[] arr = {-2,-1,-3,-8,-6};

        System.out.println("Before sort: " + Arrays.toString(arr));
        CycleSortAlgorithm(arr);

    }
    public static void CycleSortAlgorithm(int[] arr)
    {
        for (int i=0; i < arr.length-1; i++)
        {
            int element = arr[i];
            int currentIndex = i;
            int expectedIndexOfElement = arr[i] - 1;
            while(expectedIndexOfElement != currentIndex)
            {
                swap(arr, currentIndex, expectedIndexOfElement);
                System.out.println("After iteration no. " + i + " --> " + Arrays.toString(arr));
                element = arr[currentIndex];
                expectedIndexOfElement = arr[currentIndex] - 1;
            }
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
