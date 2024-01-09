import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args) {
        int[] arr = {2,4,3,5,1};
//        quickSort_lastPivot(arr, 0, arr.length-1);
        quickSort_middlePivot(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    //Method 1: when the last element of the array is considered as the pivot element.
    //No recursion call has been used here
    public static void quickSort_lastPivot(int[] arr, int start, int end)
    {
        int pivotElementIndex = end;
        while(start < end)
        {
            if(arr[start] > arr[pivotElementIndex])
            {
                swap(arr, start, pivotElementIndex);
            }
            start++;
        }
    }

    //Method 2: when the middle element is considered as the pivot element
    public static void quickSort_middlePivot(int[] arr, int low, int high)
    {
        if(low >= high)
        {
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end - start)/2;
        int pivotElement = arr[mid];

        while(start <= end)
        {
            //if it is already sorted, it will not swap
            while(arr[start] < pivotElement)
            {
                start++;
            }
            while(arr[end] > pivotElement)
            {
                end--;
            }

            if(start <= end)
            {
                swap(arr, start, end);
                start++;
                end--;
            }

            //Now pivot is a correct index, sort the 2 halves now
            //1st half: low to end
            //2nd half: start to high
            quickSort_middlePivot(arr, low, end);
            quickSort_middlePivot(arr, start, high);
        }

    }

    public static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
