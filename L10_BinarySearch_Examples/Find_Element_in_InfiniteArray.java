public class Find_Element_in_InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        int target = 30;
        int ans = findingRange(arr,target);
        System.out.println(ans);
    }
    static int findingRange(int[] arr, int target)
    {
//        First start with the size of 2
        int start = 0;
        int end = 1;
        int newStart = 0;
        //Keep doubling the start and end positions until you get the target greater than element at index of  end
        while(target > arr[end])
        {
          newStart = end + 1;
          //previous end + (size of the box) * 2 to double the size of the box
          end = end + (end - start + 1)*2;
          start = newStart;
        }
        int ans = BinarySearch_in_InfiniteArray(arr, target, newStart, end);
        return ans;
    }
    static int BinarySearch_in_InfiniteArray(int[] arr, int target, int start, int end)
    {
        int mid = 0;
        while(start<= end)
        {
            mid = start + (end - start)/2;
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
        }
        return -1;
    }
}
