public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10};
        int ans = BinarySearch(arr, 11);
        System.out.println(ans);
    }

    static int BinarySearch(int[] arr, int targetElement)
    {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end)
        {
            int mid = start + (end-start)/2;

            if (targetElement < arr[mid])
            {
                end = mid - 1;
            }
            else if (targetElement > arr[mid])
            {
                start = mid + 1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
