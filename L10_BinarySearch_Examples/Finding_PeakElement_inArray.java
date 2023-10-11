//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class Finding_PeakElement_inArray {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7,5,4,3,2,1}; //expected ans: 6
        int[] arr = {10,34,56,67,78,89,93,100,87,65,52,43,30,0}; //expected ans: 7
//        int[] arr = {3,7,8,10,3,1};    //expected ans: 3
//        int[] arr = {0,1,0};    //expected ans:1
//        int[] arr = {0,0,0,0,0,0};    //expected ans:-1
//        int[] arr = {1,2,3,2,1,0,-1};    //expected ans: 2

        int ans = BinarySearch(arr);
        System.out.println("The number " + arr[ans] + " is the peak element at index " + ans);
    }

    static int BinarySearch(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end)
        {
            int mid = start + (end-start)/2;

            if (arr[mid] < arr[mid+1])
            {
                start = mid;
            }
            else if (arr[mid] < arr[mid-1])
            {
                end = mid;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
