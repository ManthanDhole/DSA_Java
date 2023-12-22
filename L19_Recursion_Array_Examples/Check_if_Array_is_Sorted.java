public class Check_if_Array_is_Sorted {
    public static void main(String[] args) {
        int[] arr = {1,2,4,8,9,12};
//        int[] arr = {1,2,5,4,8,9,12};
//        int[] arr = {};
        int iterator = 0;

        boolean ans = isSortedArray(arr, iterator);
//        System.out.println("Sorted: " + ans);

        System.out.println(isSortedArray_shorten(arr, iterator));
    }
    public static boolean isSortedArray(int[] arr, int iterator)
    {
        if(iterator < arr.length - 1)
        {
            if(arr[iterator] < arr[iterator+1])
            {
                return isSortedArray(arr, iterator+1);
            }
            else
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isSortedArray_shorten(int[] arr, int index)
    {
        if(index == arr.length - 1) return true;
        //First expression will decide if the entire array is sorted or not
        //Second expression is the recursive call to next array index element
        return arr[index] < arr[index+1] && isSortedArray_shorten(arr, index+1);
    }
}
