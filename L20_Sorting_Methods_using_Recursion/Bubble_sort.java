import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = { 10,2,3,1,5,4,9,7,8,6 };
        int start = 0;
        int end = arr.length - 1;
        bubblesort(arr, start, end);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubblesort(int[] arr, int start, int end)
    {
        if(start == end) return;
        if(start < end)
        {
            if(arr[start] > arr[start+1])
            {
                swap(arr, start, start+1);
            }
            bubblesort(arr, start+1, end);
        }
        bubblesort(arr, 0, end-1);
    }

    public static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
