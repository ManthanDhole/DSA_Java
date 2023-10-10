public class First_Occurrence_of_a_Number_inArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33};
        int target = 10;
        int ans = FindRange_toApplyBinarySearch(arr, target);
        System.out.println(ans);
    }

    static int FindRange_toApplyBinarySearch(int[] arr, int targetElement)
    {
        int start = 0;
        int end = 1;
        int ans = -1;
        while(targetElement > arr[end])
        {
            int newStart = end+1; //Temporary Start index
            end = end + (2* (end-start + 1));
            start = newStart;
        }
        ans = BinarySearch(arr, targetElement, start, end);
        return ans;
    }

    static int BinarySearch(int[] arr, int targetElement, int start, int end)
    {
//        int start = 0;
//        int end = arr.length - 1;
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
