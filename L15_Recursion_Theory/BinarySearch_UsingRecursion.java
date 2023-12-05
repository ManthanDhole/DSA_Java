public class BinarySearch_UsingRecursion {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = -9;
        int answer = BinarySearch(arr, 0, arr.length-1, target);
        System.out.println("Target is at index: " + answer);
    }

    public static int BinarySearch(int[] arr, int start, int end, int target)
    {
        int mid = start + (end-start)/2;
//        if(mid > arr.length-1 || mid < 0 || end < 0)
//        {
//            return -1;
//        }
        if(start > end)
        {
            return -1;
        }
        
        if(target > arr[mid])
        {
            start = mid + 1;
        }
        else if(target < arr[mid])
        {
            end = mid - 1;
        }
        else
        {
            return mid;
        }
        return BinarySearch(arr, start, end, target);
    }

}

