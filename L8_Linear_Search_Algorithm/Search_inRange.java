public class Search_inRange {
    public static void main(String[] args) {
        int[] arr = {12,34,23,63,74,25,47,14,78};
//        int[] arr = {};
        int searchElement = 63;
        int fromRange = 0;
        int toRange = 8;

        System.out.println(SearchElement_inRange(arr, searchElement, fromRange, toRange));

    }

    static boolean SearchElement_inRange(int[] arr, int element, int fromRange, int toRange)
    {
        if(arr.length == 0 || fromRange < 0 || toRange >= arr.length)
        {
            return false;
        }
        for (int index = fromRange; index < toRange; index++) {
            if(element == arr[index])
            {
                return true;
            }
        }
        return false;
    }
}
