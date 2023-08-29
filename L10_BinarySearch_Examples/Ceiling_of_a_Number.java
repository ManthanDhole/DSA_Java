public class Ceiling_of_a_Number {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7,8,9,12,34,45,67,89,99};
        int target = -2;

        int ans = CeilingNumber(arr, target);
        System.out.println("Ceiling: " + ans);

        int ansFloor = FloorNumber(arr, target);
        System.out.println("Floor: " + ansFloor);
    }

    static int CeilingNumber(int[] arr, int numberToFindCeilingOf)
    {
        int start = 0;
        int end = arr.length - 1;
        if(numberToFindCeilingOf > arr[end])
        {
            return -1;
        }
        while (start <= end)
        {
            int mid = start + (end - start)/2;

            if(numberToFindCeilingOf == arr[mid])
            {
                return arr[mid];
            }
            else if(numberToFindCeilingOf < arr[mid])
            {
                end = mid - 1;
            }
            else if(numberToFindCeilingOf > arr[mid])
            {
                start = mid + 1;
            }

        }
        return arr[start];
    }

    static int FloorNumber(int[] arr, int numberToFindFloorOf)
    {
        int start = 0;
        int end = arr.length - 1;
        if(numberToFindFloorOf < arr[start])
        {
            return -1;
        }
        while(start <= end)
        {
            int mid = start + (end - start)/2;

            if(numberToFindFloorOf == arr[mid])
            {
                return arr[mid];
            }
            else if(numberToFindFloorOf < arr[mid])
            {
                end = mid - 1;
            }
            else if(numberToFindFloorOf > arr[mid])
            {
                start = mid + 1;
            }
        }
        return arr[end];
    }
}
