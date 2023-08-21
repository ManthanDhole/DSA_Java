import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr)
    {
        //Using for loop
//        for (int i = 0, j = arr.length - 1; i < arr.length/2; i++, j--) {
//            swap(arr, i, j);
//        }

        //Using while loop
        int start = 0;
        int end = arr.length - 1;
        while(start < end)
        {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] array, int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
