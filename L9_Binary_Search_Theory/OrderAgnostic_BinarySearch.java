public class OrderAgnostic_BinarySearch {
    public static void main(String[] args) {
        int[] arrAsc = {1,2,3,4,5,6,7,8,9};
        int[] arrDsc = {9,8,7,6,5,4,3,2,1};

        System.out.println(OrderAgnosticBS(arrAsc, 3));
        System.out.println(OrderAgnosticBS(arrDsc, 3));

        System.out.println(optimized_OrderAgnosticBS(arrAsc, 3));
        System.out.println(optimized_OrderAgnosticBS(arrDsc, 3));
    }

    //Optimized the condition check
    static int optimized_OrderAgnosticBS(int[] arr, int targetElement)
    {
        int start = 0;
        int end = arr.length - 1;

        boolean isAscending = arr[start] < arr[end];
        while(start <= end)
        {
            int mid = start + (end-start)/2;

            if(targetElement == arr[mid])
            {
                return mid;
            }
            if(isAscending)
            {
                if(targetElement < arr[mid])
                {
                    end = mid - 1;
                }
                else if(targetElement > arr[mid])
                {
                    start = mid + 1;
                }
            }
            else
            {
                if(targetElement > arr[mid])
                {
                    end = mid - 1;
                }
                else if(targetElement < arr[mid])
                {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    //My code
    static int OrderAgnosticBS(int[] arr, int targetElement)
    {
        int start = 0;
        int end = arr.length - 1;
        if(arr[start] < arr[end])
        {
            System.out.println("Ascending Sorted Array");
            while(start <= end)
            {
                int mid = start + (end-start)/2;
                if(targetElement < arr[mid])
                {
                    end = mid - 1;
                }
                else if(targetElement > arr[mid])
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
        else
        {
            System.out.println("Descending Sorted Array");
            while(start <= end)
            {
                int mid = start + (end-start)/2;
                if(targetElement > arr[mid])
                {
                    end = mid - 1;
                }
                else if(targetElement < arr[mid])
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
}
