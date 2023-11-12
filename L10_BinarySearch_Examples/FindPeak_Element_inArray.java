//https://leetcode.com/problems/find-peak-element/

public class FindPeak_Element_inArray {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 1, 3, 5, 6, 4};
        int[] arr = {1};
        int ans = BinarySearch(arr);
        System.out.println(ans);
    }

    static int SolutionBinarySearch(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start < end){
            int mid=start+(end-start)/2;
            if(arr[mid] > arr[mid+1]){
                // you are in decreasing part
                // this might be the answer
                //now go to left if there exist any greater value
                end = mid;
            }else{
                //you are in ascending order
                // go to right if there exist greater value
                start = mid+1;
            }
        }
        //at the end start and end are same so
        return start; //or end
    }
    static int BinarySearch(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;

        if (arr.length > 1) {
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (arr[mid] < arr[mid + 1]) {
                    start = mid;
                } else if (arr[mid] < arr[mid - 1]) {
                    end = mid;
                } else {
                    return mid;
                }
            }
        } else {
            return 0;
        }
        return -1;
    }
}
