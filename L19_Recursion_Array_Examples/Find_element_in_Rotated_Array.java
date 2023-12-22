public class Find_element_in_Rotated_Array {
    public static void main(String[] args) {
//        int[] arr = {5,6,7,8,1,2,3,4};
        int[] arr = {5,6,1,2,3,4};
        int start = 0;
        int end = arr.length - 1;
        int target = 10;

        int index = findElement(arr, target, start, end);
        System.out.println("Element is at index: " + index);
    }
    public static int findElement(int[] arr, int target, int start, int end)
    {
        if(start > end) return -1;
        int mid = start + (end-start)/2;
        if(arr[mid] == target)
        {
            return mid;
        }
        else if(arr[start] <= arr[mid])
        {
            if(target >= arr[start] && target < arr[mid])
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        else if(target >= arr[mid] && target <= arr[end])
        {
            start = mid + 1;
        }
        else
        {
            end = mid - 1;
        }
        return findElement(arr, target, start, end);
    }
}
