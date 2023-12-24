import java.util.Arrays;
//Time Complexity = O(N logN)
//Space Complexity = O(N)
public class Merge_sort {
    public static void main(String[] args) {
        int[] arr = { 4,2,3,5,1 };
//        int[] ans = mergesort(arr);
//        System.out.println(Arrays.toString(ans));

        mergesort_inPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] mergesort(int[] arr)
    {
        if(arr.length == 1)
        {
            return arr;
        }
        int mid = arr.length / 2;

        int[] firstPart = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] secondPart = mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(firstPart, secondPart);
    }
    private static int[] merge(int[] firstPart, int[] secondPart) {
        int[] mergedArray = new int[firstPart.length + secondPart.length];

        int firstPointer = 0;
        int secondPointer = 0;
        int mergedArrayPointer = 0;

        while(firstPointer < firstPart.length && secondPointer < secondPart.length)
        {
            if(firstPart[firstPointer] < secondPart[secondPointer])
            {
                mergedArray[mergedArrayPointer] = firstPart[firstPointer];
                firstPointer++;
            }
            else
            {
                mergedArray[mergedArrayPointer] = secondPart[secondPointer];
                secondPointer++;
            }
            mergedArrayPointer++;
        }
        //for the case where the iteration of one array is completed and the another array elements are remaining
        //to be merged. in that case the adding of elements to the merged array must continue for that array part

        //If the second array is completely merged but first array elements are remaining
        while(firstPointer < firstPart.length)
        {
            mergedArray[mergedArrayPointer] = firstPart[firstPointer];
            firstPointer++;
            mergedArrayPointer++;
        }

        //If the first array is completely merged but second array elements are remaining
        while(secondPointer < secondPart.length)
        {
            mergedArray[mergedArrayPointer] = secondPart[secondPointer];
            secondPointer++;
            mergedArrayPointer++;
        }

        return mergedArray;
    }
    //Second Method
    public static void mergesort_inPlace(int[] arr, int start, int end)
    {
        int mid = start + (end - start)/2;
        if(end - start == 1)
        {
            return;
        }

        mergesort_inPlace(arr, start, mid);
        mergesort_inPlace(arr, mid, end);

        merge_inPlace(arr, start, mid, end);


    }
    private static void merge_inPlace(int[] arr, int start, int mid, int end) {
        int[] mergedArray = new int[(end - start)];
        int firstPointer = start;
        int secondPointer = mid;
        int mergedPointer = 0;

        while(firstPointer < mid && secondPointer < end)
        {
            if(arr[firstPointer] < arr[secondPointer])
            {
                mergedArray[mergedPointer] = arr[firstPointer];
                firstPointer++;
            }
            else
            {
                mergedArray[mergedPointer] = arr[secondPointer];
                secondPointer++;
            }
            mergedPointer++;
        }

        while(firstPointer < mid)
        {
            mergedArray[mergedPointer] = arr[firstPointer];
            firstPointer++;
            mergedPointer++;
        }
        while(secondPointer < end)
        {
            mergedArray[mergedPointer] = arr[secondPointer];
            secondPointer++;
            mergedPointer++;
        }

        //copy the answer in original array
        for (int mergeToOriginalArrayPointer = 0; mergeToOriginalArrayPointer < mergedArray.length; mergeToOriginalArrayPointer++)
        {
            arr[start+mergeToOriginalArrayPointer] = mergedArray[mergeToOriginalArrayPointer];
        }

    }
    public static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
