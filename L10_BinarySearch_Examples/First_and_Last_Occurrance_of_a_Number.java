import java.util.Arrays;

public class First_and_Last_Occurrance_of_a_Number {
    public static void main(String[] args) {
//        int[] arr = {1,2,2,2,3,3,3,3,4,5,5,5,5,5};
//        int[] arr = {1,2,3};
        int[] arr = {0,0,1,1,1,4,5,5};
//        int[] arr ={5,7,7,8,8,10};
        int target = 2;

        int[] ans = First_and_Last_Occurrance(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] First_and_Last_Occurrance(int[] arr, int target)
    {
        int firstOcc = BinarySearch(arr, target, true);
        int lastOcc = BinarySearch(arr, target, false);

        return new int[] {firstOcc, lastOcc};
    }

    static int BinarySearch(int[] arr, int targetElement, boolean isFirstOccurrence)
    {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
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
                ans = mid;
                if(isFirstOccurrence)
                {
                    end = mid-1;
                }
                else
                {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
