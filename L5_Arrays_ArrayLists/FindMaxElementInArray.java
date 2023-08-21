public class FindMaxElementInArray {
    public static void main(String[] args) {
        int[] arr = {20,45,78,98, 56,43,89,53};
        System.out.println(Integer.MIN_VALUE);
        System.out.println(max(arr));
        System.out.println(maxInRange(arr, 0, 2));
        int[] ar = {1};
        System.out.println(maxInRange(ar, 1, 3));
    }
    //Maximum value in the entire array
    static int max(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }

    //Maximum value in a range of element in the array
    static  int maxInRange(int[] arr, int start, int end)
    {
        if(arr.length == 0)
        {
            return -1;
        }
        //Edge Cases
        if(start > end)
        {
            return -1;
        }
        int max = arr[start];
        for (int i = start; i <= end; i++) {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }
}
