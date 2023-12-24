import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
//        int[] arr = { 2,3,1,10,5,4,9,7,8,6 };
        int[] arr = { -1,-2,-3,-4 };
        int start = 0;
        int end = arr.length - 1;
        int largest = start;
        selectionsort(arr, start, end, largest);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionsort(int[] arr, int start, int end, int largest)
    {
        if(start > end) return;
        if(start <= end)
        {
            if(arr[start] > arr[largest])
            {
                largest = start;
            }
            selectionsort(arr, start+1, end, largest);
            swap(arr, largest, start);
        }
        selectionsort(arr, 0, end -1, 0);
    }
    public static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
