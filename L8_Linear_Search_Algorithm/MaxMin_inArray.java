public class MaxMin_inArray {
    public static void main(String[] args) {
        int arr[] = {3,56,74,95,73,13,72};
        System.out.println("Max number in array is: " + Max_inArray(arr));
        System.out.println("Min number in array is: " + Min_inArray(arr));
    }

    static int Max_inArray(int[] arr)
    {
        if(arr.length == 0)
        {
            return -1;
        }
        int max = arr[0];
        for(int i: arr)
        {
            if(i > max)
            {
                max = i;
            }
        }
        return max;
    }

    static int Min_inArray(int[] arr)
    {
        if(arr.length == 0)
        {
            return -1;
        }
        int min = arr[0];
        for (int i: arr)
        {
            if(i < min)
            {
                min = i;
            }
        }
        return min;
    }
}
